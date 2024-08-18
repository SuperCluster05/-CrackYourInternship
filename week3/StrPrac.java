import java.util.Scanner;
public class StrPrac {
    public static boolean Palindrome(String a){
        for(int i =0;i<(a.length());i++){
            int n = a.length();
            if(a.charAt(i) != a.charAt(n-1-i)){
                return false;
            }
        
        }
        return true;
    }
    public static String substring(String str , int si , int ei){
        String substr = "";
        for(int i =si;i<ei;i++){
            substr += str.charAt(i);

        }
        return substr;
    }
    public static void printletters(String s){
        for(int i =0;i<s.length();i++){
            System.out.print(s.charAt(i)+ " ");

        }
        System.out.println();
    }
    public static String toUpper(String str){
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch );
        
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==" " && str.length()-1){
                sb.append(charAt);
                i++;

                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        printletters(a);
        String str = "hi i am ABHIJEET";
        toUpper(str);

    }

}
