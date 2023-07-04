package sundayReview;

import java.util.*;

public class Word{ // hello
    String value;
    int vowels;
    int constants;

    public Word(String value){
        this.value = value.toLowerCase();
        this.vowels = countVowels();
        this.constants = value.length() - vowels;
    }

    private int countVowels(){
        String vowels = "aeiou";
        int counter = 0;
        for(int i = 0; i < value.length(); i++){
            if(vowels.contains(value.substring(i, i+1))){ // contains("" + value.charAt(i))
                counter++;
            }
        }

        return counter;
    }

    public String toString(){
        return value + " | vowels: " + vowels + " | constants: " + constants;
    }

}

class Test{
    public static void main(String [] args){
        // Take any sentence keep track of each word in the sentence

        String str = "HELLO MY NAME IS";
        ArrayList<Word> allWords = new ArrayList<>();

        for(String each : str.split(" ")){
            allWords.add(new Word(each)); // creating an object of the Word class, and that is added into the ArrayList
        }

        System.out.println(allWords);

        // I want just the values
        for(Word each : allWords){
            System.out.println(each.value);
        }

        // count how many vowels the sentence has?
        int totalVowels = 0;
        for(Word each : allWords){
            totalVowels += each.vowels;
        }
        System.out.println(totalVowels);

    }
}