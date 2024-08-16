class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder column = new StringBuilder();
        while(columnNumber>0){
            int rem = columnNumber%26;
            if(rem==0){
                column.append('Z');
                columnNumber = (columnNumber/26)-1;


            }else{
                column.append((char)(rem-1+'A'));
                columnNumber = columnNumber/26;
            }
        }
        return column.reverse().toString() ;
        
    }
}