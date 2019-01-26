import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Reader {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/crsto10.txt"));
//        System.out.println(lines.size());

        int n = lines.size();
        System.out.println(n);


        while (n % 100 == 0 ){
            System.out.println(lines.get());
        }

    }
}
