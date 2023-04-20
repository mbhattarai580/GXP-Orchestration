package com.example.gxporchestration.csv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CSVFilesStream {
    public static void main(String[] args) throws IOException {
        Path path= Path.of("src,main resources,cars.csv");
        Files.lines(path)
                .skip(1)
                .map(line->{
                 String[]fields =line.split(",");
                 return new Car(Integer.parseInt(fields[0]),fields[1],fields[2],fields[3]);

                        }).forEach(System.out::println);

    }
}
