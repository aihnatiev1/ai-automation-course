package homework.trello;

import homework.trello.models.*;
import com.google.gson.Gson;
import okhttp3.*;
import org.testng.annotations.Test;

import java.io.IOException;

public class TrelloApi {

    //API key
    //API token

    OkHttpClient client = new OkHttpClient();

    public String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public String put(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
        Request request = new Request.Builder()
                .url(url)
                .put(body)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public String delete(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
        Request request = new Request.Builder()
                .url(url)
                .delete(body)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public String get(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public String getBoardList(String boardId) throws IOException {
        String url = "https://api.trello.com/1/boards/" + boardId + "/lists?key=" + KEY + "&token=" + TOKEN;
        String response = get(url);
        return response;
    }


    public void createBoard(String boardName, Board board) throws IOException {
        String json = new Gson().toJson(board);
        String body = post("https://api.trello.com/1/boards/?name=" + boardName + "&key=" + KEY + "&token=" + TOKEN, json);
        System.out.println(body);
        BoardResponse boardResponse = new Gson().fromJson(body, BoardResponse.class);
        System.out.println(boardResponse.id);
    }

    public void createLabel(String boardId, String name, String color, Label label) throws IOException {
        String json = new Gson().toJson(label);
        String url = "https://api.trello.com/1/boards/" + boardId + "/labels?name="+ name + "&color=" + color +"&key=" + KEY + "&token=" + TOKEN;
        String body = post(url, json);
        System.out.println(body);
        LabelResponse labelResponse = new Gson().fromJson(body, LabelResponse.class);
        System.out.println(labelResponse.id);
    }

    public void createCard(String idList, Card card) throws IOException {
        String json = new Gson().toJson(card);
        String url = "https://api.trello.com/1/cards?idList="+ idList +"&key=" + KEY + "&token=" + TOKEN;
        String body = post(url, json);
        System.out.println(body);
        CardResponse cardResponse = new Gson().fromJson(body, CardResponse.class);
        System.out.println("id: " + cardResponse.id + " idBoard: " + cardResponse.idBoard + " idList: " + cardResponse.idList + " name: " + cardResponse.name);
    }

    public void addLabelToCard(String idCard, String idLabel) throws IOException {
        String url = "https://api.trello.com/1/cards/"+ idCard + "/idLabels?&key=" + KEY + "&token=" + TOKEN + "&value=" + idLabel;;
        Request request = new Request.Builder()
                .url(url)
                .post(RequestBody.create(null, new byte[0]))
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Ошибка: " + response.code() + " - " + response.body().string());
            }
            System.out.println("Added " + response.body().string());
        }
    }

    public void moveCardToList(String idCard, ListUpdate list) throws IOException {
        String json = new Gson().toJson(list);
        String url = "https://api.trello.com/1/cards/" + idCard + "?&key=" + KEY + "&token=" + TOKEN;
        String body = put(url, json);
        System.out.println(body);
    }

    public void createComment(String idCard, String text, CreateComment createComment) throws IOException {
        String json = new Gson().toJson(createComment);
        String url = "https://api.trello.com/1/cards/"+ idCard +"/actions/comments?text=" + text + "?&key=" + KEY + "&token=" + TOKEN;
        String body = post(url,  json);
        System.out.println(body);
    }

    public void deleteBoard(String idBoard, BoardResponse board) throws IOException {
        String json = new Gson().toJson(board);
        String url = "https://api.trello.com/1/boards/" + idBoard + "?&key=" + KEY + "&token=" + TOKEN;
        String body = delete(url, json);
        System.out.println(body);
    }

    @Test
    public void createBoard() throws IOException {
        Board board = new Board();
//        board.name = "Test Board";
        board.name = "Test 2 Board";
        createBoard("Test Board", board);
    }

    @Test
    public void createLabel() throws IOException {
        Label label = new Label();
        label.name = "Test Label";
        label.color = "red";
        createLabel("68459aac4b34c1f1e68e21ca", label.name, label.color, label);
    }

    @Test
    public void testGetBoardList() throws IOException {
        System.out.println(getBoardList("68459aac4b34c1f1e68e21ca"));
    }

    @Test
    public void createCard() throws IOException {
        Card card = new Card();
        card.name = "YUCHUUUUUUU";
        createCard("68459aac4b34c1f1e68e221b", card);
    }

    @Test
    public void addLabelToCard() throws IOException {
        addLabelToCard("6845aa318d8005f841ccff26", "6845a209d4fae2e169572f88");
    }

    @Test
    public void moveCardToDoingList() throws IOException {
        ListUpdate listUpdate = new ListUpdate();
        listUpdate.idList = "68459aac4b34c1f1e68e221c";
        moveCardToList("6845aa318d8005f841ccff26", listUpdate);
    }

    @Test
    public void moveCardToDoneList() throws IOException {
        ListUpdate listUpdate = new ListUpdate();
        listUpdate.idList = "68459aac4b34c1f1e68e221d";
        moveCardToList("6845aa318d8005f841ccff26", listUpdate);
    }

    @Test
    public void createComment() throws IOException {
        CreateComment createComment = new CreateComment();
        createComment.id = "6845aa318d8005f841ccff26";
        createComment.text = "Задача закрыта, летим в прод";
        createComment(createComment.id, createComment.text,  createComment);
    }

    @Test
    public void deleteBoard() throws IOException {
        BoardResponse board = new BoardResponse();
        board.id = "6845c8c4636d61f943f07ac3";
        deleteBoard(board.id,  board);
    }
}
