import java.util.Scanner;
public class Min {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] words = new String[6];

        System.out.println("enter 6 words to compare");
        for (int i = 0; i < words.length; i++){

            words[i] = s.nextLine();

        }

        System.out.println(min(words));
    }

    public static String min(String words[]){
        String smallest = words[0];
        for (int i = 1; i < words.length; i++){
            if (words[i].length() < smallest.length()){
                smallest = words[i];
            }
        }
        return smallest;
    }
}
