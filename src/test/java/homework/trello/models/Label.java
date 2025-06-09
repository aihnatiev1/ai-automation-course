package homework.trello.models;

public class Label {
    public String id;
    public String idBoard;
    public String name;
    public String color;

    @Override
    public String toString() {
        return "Label{" +
                "id='" + id + '\'' +
                ", idBoard='" + idBoard + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
