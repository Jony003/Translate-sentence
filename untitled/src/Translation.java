import java.io.*;

public class Translation {
    /**
     *This part is suitable for storing variables each time, so that other classes can easily call
     */
    String English;
    String Chinese;
    String PartOfSpeach;
    String PingYing;
    int Position;
    public Translation (String PartOfSpeach,String Chinese,String PingYing,String English,int Position) throws FileNotFoundException {
        if(English.startsWith("to ")){
            this.English=English.substring(3);
        }else this.English=English;
        this.Chinese=Chinese;
        this.Position=Position;
        this.PingYing=PingYing;
        this.PartOfSpeach=PartOfSpeach;

    }
    public String getChinese(){return Chinese;}
    public String getEnglish(){
        return English;
    }

    @Override
    public String toString() {
        return "English: " + English + '\n' +"Part Of Speech: "+PartOfSpeach+'\n'+
                "Chinese: " + Chinese + '\n' +"Ping Ying: "+PingYing+'\n'+
                "Position: " + Position+" "+'\n';
    }
}

