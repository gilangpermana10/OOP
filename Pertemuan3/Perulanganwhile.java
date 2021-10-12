import java.util.Scanner;

public class Perulanganwhile{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String jawab = "Y";

        while(jawab.equals("Y")){
            System.out.println("Apakah Anda ingin Mengulang Proses Y/T");
            jawab = scn.next();
        }
    }
}