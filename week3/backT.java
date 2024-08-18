public class backT{
    public static void changeArr(int arr[], int i , int val){
        //base case 
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //recursion 
        arr[i] = val;
        changeArr(arr,i+1,val+1);
        arr[i] = arr[i]-2;

    }
    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void findPermutations(String str , String ans){
        //base case 
        if(str.length() ==0){
            System.out.println(ans);
            return;
        }

        //recursiom
        for(int i =0;i<str.length();i++){
            char curr = str.charAt(i);
            //"abcde" => "ab " + "de" = "abde"
            String NewStr = str.substring(0, i) + str.substring(i+1);
            findPermutations(NewStr, ans + curr);
        }
    }

    /**
     * @param args
     */
    public static void main(String args[]){
        final int arr[]= new int[5];
        changeArr(arr,0,1);
        printArr(arr);
        String str = "abc";
        findPermutations(str, " ");

    }

    
}
