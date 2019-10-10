package demoquestion;

import java.util.Scanner;

public class DemoQuestion {
    public static void main(String[] args) {
        Question q1 = new Question();
        q1.setText("Siapa Presiden Indonesia ke-4");
        q1.setAnswer("KH. Adurrahman Wahid");
        q1.display();
        Scanner scan = new Scanner(System.in);
        System.out.print("Jawaban anda?");
        String jwb = scan.nextLine();
        System.out.println(q1.checkAnswer(jwb));
        
        ChoiceQuestion q2 = new ChoiceQuestion();
        q2.setText("Siapa ketua DPR saat ini?");
        q2.setChoices("Bamsoet", false);
        q2.setChoices("Puan M", true);
        q2.setChoices("Fadli Zon", false);
        q2.setChoices("SetNov", false);
        q2.display();
        scan = new Scanner(System.in);
        System.out.print("Jawaban anda?");
        jwb = scan.nextLine();
        System.out.println(q2.checkAnswer(jwb));
        
        
    }
}
