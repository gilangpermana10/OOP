package Task2;

public class Operator {
    private String nama;


    public void setTitelNama(String nama){
        this.nama = nama + " S.Kom";
    }
    
    public String getTitleNama(){
        return nama;
    }
    
    public int setGaji(int gajiB){
        return gajiB;
    }
    public static void main(String[] args) {

        Operator gaji = new Operator();
        gaji.setTitelNama("Gilang permana");
        int gajiB = gaji.setGaji(20000);
        int lembur = 1000000;
        int total = gajiB + lembur;
        System.out.println( "Gaji anda " + total + " " + gaji.getTitleNama());

        byte nByte = 70;
        short nShort = 500;
        int nInt = 263456;
        long nLong = 1200000;
        char nChar = 'A';
        float nFloat = 190;
        double nDouble = 387;
        boolean nBool = true;
    
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("ini Byte - " + nByte);
        System.out.println("ini short - " + nShort);
        System.out.println("ini Integer - " +nInt);
        System.out.println("Ini Long - " +nLong);
        System.out.println("Ini Character - " +nChar);
        System.out.println("Ini Float - " +nFloat);
        System.out.println("Ini Double - " +nDouble);
        System.out.println("ini Booleran - " +nBool);
    
    }

}
