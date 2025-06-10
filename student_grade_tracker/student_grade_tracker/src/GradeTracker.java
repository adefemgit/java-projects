import javax.swing.text.Keymap;
import java.util.*;

public class GradeTracker {

    private Map<Student, List<Double>> grades;

    public GradeTracker(){
        this.grades = new HashMap<>();
    }

    public void addStudentsGrades(Student student, List<Double> StudentGrades){
        if(student != null && StudentGrades!= null){
            grades.put(student, new ArrayList<>(StudentGrades));
        }

    }

    public double getGrades(Student student){
        List<Double > studentGrades = grades.getOrDefault(student, new ArrayList<>());
        return studentGrades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

    }

    public Student getTopStudent(){
        return grades.entrySet().stream().max(Comparator.comparingDouble(entry -> entry.getValue()
                .stream().mapToDouble(Double::doubleValue).average().orElse(0.0)))
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public Set<Student> getAllStudents(){
        return grades.keySet();
    }
}



