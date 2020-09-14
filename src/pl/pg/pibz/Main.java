package pl.pg.pibz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Hangman hangman = new Hangman();

        while (hangman.count <= 7){
            System.out.println(hangman.bars);
            String guess = reader.next();

            System.out.println("test");
            hangman.hang(guess);
        }

        reader.close();

    }
}

