import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12223321));
        System.out.println("//////");
        System.out.println(isPerfectNumber(-1));
        System.out.println("//////");
        System.out.println(numberToWords(1010));

    }
    public static boolean isPalindrome(Integer sayi) {
        String text=sayi.toString();
        String reversedText = new String();

        for(int i=text.length()-1;0<=i;i--){
            reversedText+=text.charAt(i);
        }
        return text.equals(reversedText);
    }

    public static boolean isPerfectNumber(Integer sayi) {
        int toplam=0;
        if(sayi<0){
            return false;
        }
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                toplam+=i;
            }else{
                continue;
            }
        }
        if(toplam==sayi){
            return true;
        }
        return false;
    }

    public static String numberToWords(Integer sayi){
        if(sayi<0){
            return "Invalid Value";
        }
        String[] texts={"Zero","One","Two","Three","For","Five","Six","Seven","Eight","Nine"} ;

        String sayiToString= sayi.toString();
        String sayiToText=new String();

        for(int i=0; i<sayiToString.length();i++){
            sayiToText+=texts[Integer.parseInt(String.valueOf(sayiToString.charAt(i)))]+" ";
        }

        return sayiToText;
    }

}