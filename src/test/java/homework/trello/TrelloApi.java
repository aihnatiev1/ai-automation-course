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
}
