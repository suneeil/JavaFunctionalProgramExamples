package modifyFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class FilesExample {

    public static void main(String[] args) throws IOException {
        Path fileURI = Path.of("/Users/sunilrao/Workspace/intellij_Workspace/JavaFunctionalProgramming/src/modifyFile/somefile.txt");
        System.out.println(fileURI.toUri());
        Files.lines(fileURI)
                .forEach(System.out::println);

        System.out.println("=================");

        Files.lines(fileURI)
                .map(str -> str.split(" ")) //This would give an stream of array of strings --> Stream<String[]>
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);

        System.out.println("=================");

        Files.list(Paths.get("."))
                .filter(Files::isDirectory)
                .forEach(System.out::println);
    }
}
