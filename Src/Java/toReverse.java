package Selenium_HandOn;

public class toReverse {
    public static void main(String[] args) {
        String A ="slam";
        char n;
        for(int i=A.length();i>0;i--){
            n=A.charAt(i-1);
            System.out.print(n);

        }
    }
}
