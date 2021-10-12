import java.util.Scanner;

public class kuadrat {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        
        // System.out.println("Masukan Angka :");
        // int a = input.nextInt();
        // System.out.println("Masukan kuadrat :");
        // int b = input.nextInt();

        int a = 2;
        int b = 2;

        int awal = a;
        for(int i=1; i< b; i++){
            System.out.println(a + " * " + awal);
            a = a * awal;
        }

        System.out.println("Hasil Kuadarat dari " + awal +" adalah " + a);

    }
    
}
