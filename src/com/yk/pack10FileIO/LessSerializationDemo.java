package com.yk.pack10FileIO;

import com.yk.pack7Collections.Less35Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;

public class LessSerializationDemo {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "student.out");

        writeObject(path);

    }

    private static void writeObject(Path path) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            Less35Person tom = new Less35Person(1, "Tom", "Soer");
            objectOutputStream.writeObject(tom);
        }
    }


}
