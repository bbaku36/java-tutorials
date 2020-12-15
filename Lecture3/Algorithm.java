import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Algorithm {
    public static void main(String[] args) {
        int Total;
        int gradeCounter;
        int grade;

        double average;

        String gradeString;

        Total=0;

        gradeCounter=0;

        gradeString=JOptionPane.showInputDialog("Enter integer grade or -1 to Quit");

        grade=Integer.parseInt(gradeString);

        while (grade !=-1) {Total=Total+grade; 
        
        gradeCounter=gradeCounter+1;

        gradeString=JOptionPane.showInputDialog("Enter integer grade or -1 to Quit");

        grade=Integer.parseInt(gradeString);
        }

        DecimalFormat twoDigits= new DecimalFormat("0.00");

        if (gradeCounter!=0) {
            average=(double)Total/gradeCounter;

            JOptionPane.showMessageDialog(null,"Class average is"+twoDigits.format(average),"Class average",JOptionPane.INFORMATION_MESSAGE);
            
        }

        else JOptionPane.showMessageDialog(null,"No grades were entered","Class average", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
