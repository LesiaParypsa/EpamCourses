package homework.lesson6_part2_2;
import java.util.List;

public class Neurosurgeon extends Surgeon {
    private List<String> patients;
    private String operatingroom;

    public void treat (){
        System.out.println("The Neurosurgeon is treating");
    }
}
