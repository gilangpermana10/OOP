public class conan{

    public static class People{
        public String nama;
        public int umur;
        public String tempatTinggal;
        public int tabungan;
    
        People(String nama, int umur, String tempatTinggal, int tabungan){
            this.nama = nama;
            this.umur = umur;
            this.tempatTinggal = tempatTinggal;
            this.tabungan = tabungan;
        }
    }

    public static void main(String[] args) {
        People mafiaDon = new People("Howward", 42, "nevada", 12000000);
        People mafiaUnderboss = new People("Thomas", 34, "nevada", 1200000);
        People mafiaCapo = new People("sparrow", 22, "boston", 800000);
        People nonmafia = new People("Gilang", 21, "Nyalindung", 100);

        System.out.println(getCharacteristic(mafiaDon));
        System.out.println(getCharacteristic(mafiaUnderboss));
        System.out.println(getCharacteristic(mafiaCapo));
        System.out.println(getCharacteristic(nonmafia));
        
    }

    public static String getCharacteristic(People people){
        String syndicate = getSyndicate(
          people.umur,
          people.tempatTinggal,  
          people.tabungan
        );

        switch(syndicate.toLowerCase()){
            case"don":
            case"underboss":
            case"capo":
                return people.nama + " kemungkinan adalah seorang anggota mafia dengan pangkat " + syndicate ;
            default:
                return people.nama + " tidak mencurigakan";
        }
    }

    public static String getSyndicate(int umur, String tempatTinggal, int tabungan){
        if(umur > 40 & tabungan > 10000000){
            switch(tempatTinggal.toLowerCase()){
                case "nevada":
                case "new york":
                case "havana":
                    return "Don";
                default :
                return "";
            }
        }

        else if((umur >= 25  & umur<=40) && (tabungan >= 1000000 || tabungan <= 2000000)){
            switch(tempatTinggal.toLowerCase()){
                case "new jersey":
                case "manhattan":
                case "nevada":
                    return "Underboss";
                default :
                return "";
            }
        }

        else if((umur >= 18  & umur<=24) && (tabungan < 1000000)){
            switch(tempatTinggal.toLowerCase()){
                case "california":
                case "detroit":
                case "boston":
                    return "capo";
                default :
                return "";
            }
        }
        
        else{
            return "";
        }
    }
    
}