package homework.trello.models;

public class BoardResponse {
    public String id;
    public String name;

    @Override
    public String toString() {
        return "BoardResponse{" +
                "id='" + id + '\'' +
                ", boardName='" + name + '\'' +
                '}';
    }
}
