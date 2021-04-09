package ru.volkov.integration.ftp;

import java.io.*;

public class FilePrinter {

    public void print(String file) {
        System.out.println("Invoking the print method with a string");
        System.out.println(file);
    };

    public void print(File file) {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
