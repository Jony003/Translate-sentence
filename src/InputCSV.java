import java.io.*;
import java.util.ArrayList;

public class InputCSV {
    BufferedReader br = new LineNumberReader(new FileReader("HSK Words.csv"));
    ArrayList<Translation> translations=new ArrayList<>();

    /**3
     * Add all data in the "English Chinese Translations.csv" into an ArrayList and separate them into chinese and english parts also gives them positions.
     * @throws IOException .
     */
    public InputCSV() throws IOException {
        String line;

        int x =0;

        while ((line=br.readLine())!=null){
            String[] array=line.split(",");
            Translation neWord = new Translation( array[0].replace("\"", "") , array[1]  ,array[2],array[3],x );
            translations.add(neWord);
            x++;
        }
    }

    public ArrayList<Translation> getTranslations() {
        return translations;
    }
}




