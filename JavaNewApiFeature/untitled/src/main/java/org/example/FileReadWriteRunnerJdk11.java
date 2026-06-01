package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunnerJdk11 {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("src/main/resources/Sample.txt");
        String fileContent=Files.readString(path);
        System.out.println(fileContent);
        String writeContent =fileContent.replace("Line","Lines");
        Path path1= Paths.get("src/main/resources/SampleNew.txt");
        Files.writeString(path1,writeContent);
    }
}
