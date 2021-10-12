import java.util.Scanner;

public class ReversedText {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat = input.next();
        String ReversedKalimat = "";

        for(int i = kalimat.length() - 1; i>= 0; i--){
            ReversedKalimat += kalimat.substring(i, i+1);
        }

        System.out.println(ReversedKalimat);

    }
}
