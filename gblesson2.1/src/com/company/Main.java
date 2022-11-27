package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class Main {

    public static void main(String[] args) throws IOException{
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/src/com/company/data/storage.txt");
        File storage = new File(pathFile);
        Path storagePath = Paths.get(pathFile);
        List<String> storageData = Files.readAllLines(storagePath);
        for (String str : storageData){
            String substr = str.substring(1,str.length());
            StringBuilder stringSQL = new StringBuilder("SELECT * FROM storage WHERE ");
            String[] parameters = substr.split(",\"");
            for (String pars : parameters){
                String[] temp = pars.split("\":");
                if (temp[1].equalsIgnoreCase("\"NULL\"") == false){
                    stringSQL.append(temp[0]+" = "+temp[1]+" AND ");
                }

            }
            System.out.println(stringSQL);
        }

    }
}
