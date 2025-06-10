import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {

    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
                return false;

        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    public String toString(){
        return "Name: " + name + " ID: " + id;
    }



}
