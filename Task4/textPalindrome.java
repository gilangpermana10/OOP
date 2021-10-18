public class textPalindrome {

    public static void main(String[] args) {
        
        String text = "kasur ini rusak";
        String ReversedText = "";
        for(int i = text.length() - 1; i>= 0; i--){
            ReversedText += text.substring(i, i+1);  
        }
        if(ReversedText.equals(text)){
            System.out.println("Text (" + text +") adalah Palindrome");
        }else{
            System.out.println("Text (" + text +") bukan Palindrome");
        }

    }
    
}
