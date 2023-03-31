package Selenium_HandOn;

import java.util.List;

public class splitAndCount {
    public static void main(String[] args) {
        // changing the input string for git understanding
        String str ="sun rise in the east and sun set in the west";
        String[] a = str.split(" ");
        String ref = "sun";
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int count=0;
        for (int i=0;i<a.length;i++){
            if(ref.equals(a[i])){
                count++;
            }

        }
        System.out.println("the word Sun has repeated for:"+count);


    }
}
