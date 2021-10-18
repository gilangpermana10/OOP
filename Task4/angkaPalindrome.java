public class angkaPalindrome {
	public static void main(String[] args) {
        
        int angka = 20202;
	    String angkaString = String.valueOf(angka);
        String ReversedAngka = "";
        for(int i = angkaString.length() - 1; i>= 0; i--){
            ReversedAngka += angkaString.substring(i, i+1);  
        }
        if(ReversedAngka.equals(angkaString)){
            System.out.println("Text (" + angka +") adalah Palindrome");
        }else{
            System.out.println("Text (" + angka +") bukan Palindrome");
        }

    }
    
	    
    
}
