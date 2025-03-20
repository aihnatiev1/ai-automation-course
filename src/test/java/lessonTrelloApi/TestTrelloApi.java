package lessonTrelloApi;

import org.testng.annotations.Test;

import java.io.IOException;


public class TestTrelloApi {


    @Test
    public void testGetBoardLists() throws IOException {
        TrelloApiNew trelloApiNew = new TrelloApiNew();
        String boardList = trelloApiNew.getBoardLabels("67daa189cdd17e4e88702a0e");
        System.out.println(boardList);
    }
}
