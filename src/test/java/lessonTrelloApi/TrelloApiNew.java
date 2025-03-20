package lessonTrelloApi;

import com.google.gson.Gson;
import lessonTrelloApi.models.Card;
import okhttp3.*;
import org.testng.annotations.Test;

import java.io.IOException;


public class TrelloApiNew {

    public static final String KEY = TrelloLoginPass.key;
    public static final String TOKEN = TrelloLoginPass.token;

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

    public String get(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public String getBoardList(String boardId) throws IOException {
        String url = "https://api.trello.com/1/boards/" + boardId + "/lists?cards=all&key=" + KEY + "&token=" + TOKEN;
        String response = get(url);
        return response;
    }

    public String getBoardLabels(String boardId) throws IOException {
        String url = "https://api.trello.com/1/boards/" + boardId + "/labels?key=" + KEY + "&token=" + TOKEN;
        String response = get(url);
        return response;
    }

    public void createCard(String idList, Card card) throws IOException {
        String json = new Gson().toJson(card);
        String body = post("https://api.trello.com/1/cards?idList=" + idList + "&key=" + KEY + "&token=" + TOKEN, json);
        System.out.println(body);
    }

    @Test
    public void testGetBoardList() throws IOException {
        System.out.println(getBoardList("67daa189cdd17e4e88702a0e"));
        Card card = new Card();
        card.name = "Test Card";
        card.desc = "This is a test card";
        createCard("67daa189cdd17e4e88702a55", card);
    }
}