
package javafxinchtocenti;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // import scanner module
        Scanner s = new Scanner(System.in);
        
        // first 2 messages 
        System.out.println("Welkom bij de inches to centimeter converter");
        System.out.println("Vul een waarde inch in:");
        
        // input data from user
        double inches = s.nextDouble();
        
        // formula convert inches to centimeters
        double centimeters = inches * 0.0254;
        
        // print resultaat
        System.out.println(centimeters + " cm");
    }
    
}
