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
        }
        catch (IOException e){
            System.err.println("Error in BufferedReader");
            e.printStackTrace();
        }
        return book;
    }

}
