package Lecture2;

import javax.swing.JOptionPane;

public class IF {
    public static void main(String[] args) {
        String firstnumber;
        String secondnumber;
        String result;
        int number1;
        int number2;
        firstnumber = JOptionPane.showInputDialog("Enter first integer");
        secondnumber = JOptionPane.showInputDialog("Enter second integer");

        number1 = Integer.parseInt(firstnumber);
        number2 = Integer.parseInt(secondnumber);

        result = "";
        if (number1 == number2)
            result = result + number1 + "==" + number2;

        if (number1 != number2)
            result = result + number1 + "!=" + number2;

        if (number1 < number2)
            result = result + "\n" + number1 + "<" + number2;

        if (number1 > number2)
            result = result + "\n" + number1 + ">" + number2;

        if (number1 <= number2)
            result = result + "\n" + number1 + "<=" + number2;

        if (number1 >= number2)
            result = result + "\n" + number1 + ">=" + number2;

        JOptionPane.showMessageDialog(null, result, "Compansion result", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

}
