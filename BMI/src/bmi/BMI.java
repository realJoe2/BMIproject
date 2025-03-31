/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

/**
 *
 * @author joeyb
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BMIgui bmiG = new BMIgui();
        bmiG.setVisible(true);
    }
    
}
class BMIcalculator
{
    public float calculate(int inches, float pounds)
    {
        return (pounds * 703)/(inches * inches);
    }
            
}