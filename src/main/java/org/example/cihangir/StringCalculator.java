package org.example.cihangir;

public class StringCalculator {

    public int sum(String input){
        if(input == null || input == "") {
            return 0;

        }
        else {
            int getal = Integer.parseInt(input);
            return getal;
        }
    }

}
