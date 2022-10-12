import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean wanna;
        do{
            System.out.println("Impute the phrase you want to translate: ");
            Scanner input = new Scanner(System.in);
            String newWord = input.nextLine();
            InputCSV finder = new InputCSV();
            new FindWord(finder.getTranslations(),newWord);
            System.out.println("Do you want translate again? (Y for continue,F for stop)");
            Scanner in = new Scanner(System.in);
            String word = in.nextLine();
            if(word.equals("Y")){
                wanna=true;
            } else if (word.equals("F")) {
                wanna = false;
            }
            else wanna = false;
        }while (wanna);
    }

}



