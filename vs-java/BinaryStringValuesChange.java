public class BinaryStringValuesChange {
    public static void main(String[] args) {
        String s = "1010";
        int r=2; 
        int n=3; // chatAt index after changing
        StringBuilder str = new StringBuilder(s);
        StringBuilder str2;
        for(int i=0; i<r; i++){
            str2  = new StringBuilder();
            for(int j=0; j<str.length(); j++){
                char c = str.charAt(j);
                if(c=='0'){
                    str2.append("01");
                }else{
                    str2.append("10");
                }
            }
            str = str2; //replace str with str2 and will reuse in next iteration
            System.out.println("New string = " +str);
        }
        System.out.println("char at index "+ str.charAt(n));
    }
}
