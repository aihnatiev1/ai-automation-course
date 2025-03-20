package lessonTrelloApi.serDeser;

import java.io.Serializable;


public class MyStorage implements Serializable {

    public String name;
    public int age;

    @Override
    public String toString() {
        return "MyStorage{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
