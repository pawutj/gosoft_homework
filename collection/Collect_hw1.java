import java.util.Arrays;
import java.util.ArrayList;

class Collect_hw1 {
    public static void main(String[] args) {
        String[] rawData = { "id:1001 firstname:Luke lastname:Skywalker", "id:1002 firstname:Luke lastname:Skywalker" };
        ArrayList<String> data = new ArrayList<>(Arrays.asList(rawData));
        System.out.println(data);
    }

}
