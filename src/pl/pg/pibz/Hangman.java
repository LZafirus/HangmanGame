package pl.pg.pibz;

import java.util.List;

public class Hangman {

    public static List<String> dictionary = Dictionary.loadDictionary();
    public static String word = dictionary.get((int)(Math.random() * dictionary.size()));

}
