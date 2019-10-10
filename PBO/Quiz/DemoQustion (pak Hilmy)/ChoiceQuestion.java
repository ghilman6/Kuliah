package demoquestion;

import java.util.ArrayList;

public class ChoiceQuestion extends Question{
    ArrayList<String> choices = new ArrayList<String>();
    public void setChoices(String pil,boolean isCorrect){
        choices.add(pil);
        if(isCorrect){
            setAnswer(choices.size()+"");
        }
    }
    //override --> menulis ulang method parent
    @Override
    public void display() {
        super.display();
        for(int i=0;i<choices.size();i++){
            System.out.println(i+1+"."+choices.get(i));
        }   
    }
    
}
