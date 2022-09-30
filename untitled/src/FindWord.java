import java.util.ArrayList;

public class FindWord {
    String answer;
    public FindWord(ArrayList<Translation> translations, String input){
        String[] splited = input.split("\\s+");
        for(int i=0;i<splited.length;i++){
            for(int j = 0; j<translations.size();j++){
                if(splited[i].equals(translations.get(j).getEnglish())){
                    answer=answer+translations.get(j).getChinese();
                }
            }

        }
        System.out.println(answer);
    }
}
