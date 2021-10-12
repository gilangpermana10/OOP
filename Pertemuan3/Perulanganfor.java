public class Perulanganfor{

    public static void main(String[] args) {
        // for(int i=10; i <=100; i+=10) {
        //     System.out.println(i);
        // }

        //mencetak angka 10,20,30,40,50,60,70,80,90,100

        // for(int i=1; i <=10; i++) {
        //     int result = i *10;
        //     System.out.println(result);
        // }

        //mencetak angka genap

        // for(int i=0; i <=10; i+=2) {
        //     System.out.println(i);
        // }
        
        // int sign = 1;
        // for(int i=1; i <=20; i++) {
        //     System.out.println(i*sign);
        //     sign = sign * -1;
        // }



        String kalimat = "kuliah PBO hari selasa";
        int sign = 0;
        for(int i=0; i < kalimat.length(); i++){
            String karakter = kalimat.toLowerCase().substring(i, i+1);
            // System.out.println(karakter);
            if(karakter.equals("a")||karakter.equals("i")||karakter.equals("u")||karakter.equals("e")||karakter.equals("o")){
                sign = sign + 1;
            }
        }
        System.out.println("Huruf vokal ada : " + sign);
            
    }
}