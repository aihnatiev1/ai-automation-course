package homework.trello;

import homework.trello.models.*;
import org.testng.annotations.Test;

import java.io.IOException;

public class TrelloApiExample {

    private final TrelloApi api = new TrelloApi();

    @Test
    public void createBoard() throws IOException {
        Board board = new Board();
//        board.name = "Test Board";
        board.name = "Test 2 Board";
        api.createBoard("Test Board", board);
    }

    @Test
    public void createLabel() throws IOException {
        Label label = new Label();
        label.name = "Test Label";
        label.color = "red";
        api.createLabel("68459aac4b34c1f1e68e21ca", label.name, label.color, label);
    }

    @Test
    public void testGetBoardList() throws IOException {
        System.out.println(api.getBoardList("68459aac4b34c1f1e68e21ca"));
    }

    @Test
    public void createCard() throws IOException {
        Card card = new Card();
        card.name = "YUCHUUUUUUU";
        api.createCard("68459aac4b34c1f1e68e221b", card);
    }

    @Test
    public void addLabelToCard() throws IOException {
        api.addLabelToCard("6845aa318d8005f841ccff26", "6845a209d4fae2e169572f88");
    }

    @Test
    public void moveCardToDoingList() throws IOException {
        ListUpdate listUpdate = new ListUpdate();
        listUpdate.idList = "68459aac4b34c1f1e68e221c";
        api.moveCardToList("6845aa318d8005f841ccff26", listUpdate);
    }

    @Test
    public void moveCardToDoneList() throws IOException {
        ListUpdate listUpdate = new ListUpdate();
        listUpdate.idList = "68459aac4b34c1f1e68e221d";
        api.moveCardToList("6845aa318d8005f841ccff26", listUpdate);
    }

    @Test
    public void createComment() throws IOException {
        CreateComment createComment = new CreateComment();
        createComment.id = "6845aa318d8005f841ccff26";
        createComment.text = "Задача закрыта, летим в прод";
        api.createComment(createComment.id, createComment.text,  createComment);
    }

    @Test
    public void deleteBoard() throws IOException {
        BoardResponse board = new BoardResponse();
        board.id = "6845c8c4636d61f943f07ac3";
        api.deleteBoard(board.id,  board);
    }
}
