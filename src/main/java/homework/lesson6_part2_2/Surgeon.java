package homework.lesson6_part2_2;
import java.util.List;

public class Surgeon implements Doctor{
    private List<String> instruments;
    private String room;


    public void treat() {
        System.out.println("The Surgeon is treating");

    }
}
