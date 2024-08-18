import java.util.*;
public class Strings  {
    public static float   Directions(String path){
        int x = 0, y=0;
        for(int i =0;i<path.length();i++){
            char dir = path.charAt(i);
            //South 
            if(dir == 'S'){
                y--;
            }
            //North 
            else if(dir  == 'N'){
                y++;
            }
            //West 
            else if (dir == 'W'){
                x--;
            }
            //East 
            else{
                x++;
            }


        }
        int X2 =x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 +Y2);


    }
    public static  boolean Palindrome(String a){
        for(int i =0;i<(a.length())/2;i++){
            int n= a.length();
            if(a.charAt(i)!= a.charAt(n-1-i)){
                //palindrome
                return false;
            }
            

        }
        return true;

    }
    public static void printletters(String str){
        for(int i =0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si;i<ei ;i++){
            substr +=str.charAt(i);
        }
        return substr;
    }
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)== ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else{
                sb.append(str.charAt(i));

            }

        }
        return sb.toString();
    }
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
               
            }
            sb.append(str.charAt(i));
           
            if(count >1){
                sb.append(i);

            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        char arr[] = {'a','b','v'};
        
        String str3 = new String ("xyz");
        //String is Immutable 

        Scanner sc = new Scanner(System.in);
        String a  = sc.nextLine();
        System.out.println(a.length());
        String firstName = "Abhijeet";
        String lastName = "Singh";
        String fullName = firstName + " " +  lastName;
        
        String path = "WNEENESENNN";
        System.out.println(Directions(path));
        
       //String comparison 
       String s1 = "Abhi";
       String s2 = "Abhi";
       String s3 = new String("Abhi");

       if(s1 == s2){
        System.out.println("Strings are equal");
       }
       else{
        System.out.println("Strings are not equal");
       }

       if(s1.equals(s3)){
        System.out.println("Strings are equal");

       }else{
        System.out.println("Strings are not equal ");
       }

       //Substring 
       
    //    System.out.println(substring(str, 0, 7));
       
    //    //STring largest 
    //    String fruits[] = {"apple","mango","banana"};
       
    //    String largest = fruits[0];
    //    for(int i =0;i<fruits.length;i++){
    //     if(largest.compareToIgnoreCase(fruits[i])  <0){
    //         largest = fruits[i];


    //     }
    //    }
    //    System.out.println(largest);

    //    StringBuilder sb = new StringBuilder("");
    //    for(char ch = 'a'; ch<='z';ch++){ 
    //    sb.append(ch);
    //    }
    //    System.out.println(sb.length());


      String str = "aaabbcccdd";
      System.out.println(compress(str));


    }

    
}
