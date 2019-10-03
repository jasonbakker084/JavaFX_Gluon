/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxinchtocenti;

//import java.util.Scanner;

/**
 *
 * @author jasonbakker
 */
public class Converter {
    private double centi;
    private double inch;
    private double result;
    
//    Scanner input = new Scanner(System.in);
//    double centi = input.nextDouble();

    public Converter(double centi, double inch, double result) {
        this.centi = centi;
        this.inch = inch;
        this.result = result;
    }
    
    public String convert() {
         double result = this.centi * 0.0254;         
         String strresult = Double.toString(result);
         return strresult;
    }

    public double getCenti() {
        return centi;
    }

    public void setCenti(double centi) {
        this.centi = centi;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    
    
}
