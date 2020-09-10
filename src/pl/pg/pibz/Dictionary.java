package pl.pg.pibz;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Dictionary {

    private static ArrayList<String> book = new ArrayList<>();

    public static ArrayList<String> loadDictionary(){

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("d:/HangmanGame/words.txt"), "UTF-8"));

            while(true){
                String line = reader.readLine();
                if (line != null) {
                    book.add(line);
                } else {
                    break;
                }
            }
        }
        catch (IOException e){
            System.err.println("Error in BufferedReader");
            System.err.println("Probably wrong path to file.");
            e.printStackTrace();
        }
        return book;
    }
}
