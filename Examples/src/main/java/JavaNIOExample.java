import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIOExample {
    public static void main(String[] args) {

        List<Path> paths = new ArrayList<>();
        paths.add(Paths.get("client_storage/1.txt"));
        paths.add(Paths.get("client_storage"));
        paths.add(Paths.get("."));

        for (Path path: paths) {
            System.out.println("______________________________________________");
            System.out.println("method getFileName: " + path.getFileName());
            System.out.println("method getFileSystem: " + path.getFileSystem());
            System.out.println("method getName : " + path.getName(0));
            System.out.println("isExists : " + Files.exists(path));
            System.out.println("Is Directory: " + Files.isDirectory(path));
        }


    }
}
