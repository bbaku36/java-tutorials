

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Addition {
    public static void main(String[] args) {
        String firstnumber;
        String secondnumber;
        String thirdnumber;
        String forthnumber;
        String fifthnumber;
        String sixthnumber;
        String seventhnumber;
        int number1;
        int number2;
        double number3;
        Double number4;
        double number5;
        double number6;
        double number7;
        Double sum;
        double multiplysum;
        double splitsum;
        firstnumber= JOptionPane.showInputDialog("Enter first integer");
        
        secondnumber=JOptionPane.showInputDialog("Enter second integer");
        thirdnumber=JOptionPane.showInputDialog("Enter third integer");

        number1 = Integer.parseInt(firstnumber);
        number2 = Integer.parseInt(secondnumber);
        number3=Double.parseDouble(thirdnumber);
        sum= number1+number2+number3;
        JOptionPane.showMessageDialog(null, "The sum is" + sum , "results", JOptionPane.PLAIN_MESSAGE);

        forthnumber=JOptionPane.showInputDialog("Enter first multiply number");
        fifthnumber=JOptionPane.showInputDialog("Enter second multiply number");

        number4=Double.parseDouble(forthnumber);
        number5=Double.parseDouble(fifthnumber);
         
        multiplysum=number4*number5;

        JOptionPane.showMessageDialog(null, "the sum is"+multiplysum, "multiply", JOptionPane.INFORMATION_MESSAGE);

        
    
        DecimalFormat twoDigits= new DecimalFormat("0.00");
        
        sixthnumber=JOptionPane.showInputDialog("SPLIT NUMBER");
        seventhnumber=JOptionPane.showInputDialog("SPLIT NUMBER");

        number6=Double.parseDouble(sixthnumber);
        number7=Double.parseDouble(seventhnumber);
        
       
        splitsum=number6/number7;

        JOptionPane.showMessageDialog(null, "the sum is"+twoDigits.format(splitsum), "Split", JOptionPane.INFORMATION_MESSAGE);


       
    }
    
}
