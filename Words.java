import java.util.ArrayList;
import java.util.List;

public class Words {
    public static void main(String[] args) {
        String text = "For given text find the longest and the shortest words";
        String[] word = text.split(" ");
        String longestWord = word[0];
        String shortestWord = word[0];
        List<String> longWords = new ArrayList<>();
        List<String> shortWords = new ArrayList<>();
        for (int i = 1; i < word.length; i++) {
            if(word[i].length() > longestWord.length()){
                longestWord = word[i];
            }
            if(word[i].length() < shortestWord.length()){
                shortestWord = word[i];
            }
        }
        for (int i = 0; i < word.length; i++) {
            if(longestWord.length() == word[i].length()){
                longWords.add(word[i]);
            }
            if(shortestWord.length()==word[i].length()){
                shortWords.add(word[i]);
            }
        }
        System.out.println("LONGEST WORDS: ");
        for(String w: longWords){
            System.out.print(w + " ");
        }
        System.out.println();
        System.out.println("SHORTEST WORDS: ");
        for(String w: shortWords){
            System.out.print(w + " ");
        }

    }
}
