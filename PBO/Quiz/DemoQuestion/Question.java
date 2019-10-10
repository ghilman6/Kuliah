package demoquestion;
public class Question {
    private String text;
    private String answer;
    public void setText(String questionText){
         text = questionText;
    }
    public void setAnswer(String answer){
        this.answer = answer;
    }
    public boolean checkAnswer(String response){
        return response.equals(answer);
    }
    public void display(){
        System.out.println(this.text);
    }
}
