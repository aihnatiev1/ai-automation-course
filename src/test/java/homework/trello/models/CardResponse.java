package homework.trello.models;

public class CardResponse {
    public String id;
    public String idBoard;
    public String idList;
    public String name;

    @Override
    public String toString() {
        return "CardResponse{" +
                "id='" + id + '\'' +
                ", idBoard='" + idBoard + '\'' +
                ", idList='" + idList + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
