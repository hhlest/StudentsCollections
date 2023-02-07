import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(Input.readInputFile());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
