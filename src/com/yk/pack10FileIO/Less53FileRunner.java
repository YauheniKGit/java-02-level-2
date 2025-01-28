package com.yk.pack10FileIO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Less53FileRunner {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("resources", "writer.txt");
        Files.write(path, List.of("Hi Files utility class"));
//        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePath)) ) {
        BufferedWriter fileWriter = Files.newBufferedWriter(path);
            fileWriter.append("Hello world");



    }

}
