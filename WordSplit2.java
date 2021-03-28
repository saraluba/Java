public class WordSplit2 {
    public static void main(String[] args) {
        String word = args[0];
        for(int i = 0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}

/*
1. With .toCharArray() more convenient is enhanced for loop
2. With .charAt(index) more convenient is for loop
 */