package pl.pg.pibz;

import java.util.List;

import static sun.misc.Version.println;

public class Hangman {

    public static List<String> dictionary = Dictionary.loadDictionary();
    public static String word = dictionary.get((int) (Math.random() * dictionary.size()));
    public static String bars = new String(new char[word.length()]).replace("\0","*");
    public static int count = 0;

    public void hang (String guess){

        String newbars = "";

        for (int i = 0; i < word.length(); i++ ){
            if(word.charAt(i) == guess.charAt(0)){
                newbars += guess.charAt(0);
            }
            else if (bars.charAt(i) != '*'){
                newbars += word.charAt(i);
            }
            else {
                newbars += "*";
            }
        }

        if (bars.equals(newbars)) {
            count++;
            hangmanImage();
        }
        else {
            bars = newbars;
        }

        if (bars.equals(word)){
            System.out.println("Win ! ! !  " + word);
        }
    }

    private void hangmanImage(){
        if (count == 1){
            System.err.println("Incorrect. Wrong letter!");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("________");
        }
        if (count == 2){
            System.err.println("Incorrect. Wrong letter!");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("_|_______");
        }
        if (count == 3){
            System.err.println("Incorrect. Wrong letter!");
            System.out.println(" |------");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("_|_______");
        }
        if (count == 4){
            System.err.println("Incorrect. Wrong letter!");
            System.out.println(" |-----|-");
            System.out.println(" |     |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("_|_______");
        }
        if (count == 5){
            System.err.println("Incorrect. Wrong letter!");
            System.out.println(" |-----|-");
            System.out.println(" |     |");
            System.out.println(" |     \\/");
            System.out.println(" |");
            System.out.println("_|_ _ _ _");
        }
        if (count == 6){
            System.err.println("Incorrect. Wrong letter!");
            System.out.println(" |-----|-");
            System.out.println(" |     |");
            System.out.println(" |    \\o/");
            System.out.println(" |");
            System.out.println("_|________");
        }
        if (count == 7){
            System.err.println("Incorrect. Wrong letter!");
            System.out.println(" |-----|-");
            System.out.println(" |     |");
            System.out.println(" |    \\o/");
            System.out.println(" |    /\\");
            System.out.println("_|________");
            System.err.println("Szukane słowo to: " + word);
        }
    }
}
