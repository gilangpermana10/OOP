public class persegiFC {
    public static void main(String[] args) {
        int nomorPunggung = 80;
        String posisi = "";

        //genap
        if (nomorPunggung %2 == 0 ){
            posisi += "Target Attaker";
        
            if(nomorPunggung >= 50 && nomorPunggung <= 100){
                posisi += " - calon kapten Tim";
            }
        }

        // ganjil
        if (nomorPunggung %2 == 1){
            posisi += "Defender";
        
            if(nomorPunggung >= 90){
                posisi += " - Playmaker";
            }
        }
        
        
        //ganjil kelipatan 3 & 5
        if (nomorPunggung % 3 == 0 || nomorPunggung % 5 ==0 ){
            posisi += " Keeper";
        }

        System.out.println("anda bisa berada di posisi "+ posisi);
    }
    
}
