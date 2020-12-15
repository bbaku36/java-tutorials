import javax.swing.JOptionPane;

public class FOR {
    public static void main(String[] args) {
        {
            int total = 0;

            for (int number = 2; number <= 100; number += 2)
                total += number;

            JOptionPane.showMessageDialog(null, "The sum is" + total, "Total even integers from 2 to 100",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        int number3 = 0;
        for (int number1 = 2; number1 <= 50; number1 += 20)
            number3 += number1;

        JOptionPane.showMessageDialog(null, "The sum is" + number3, "Total even integers from 2 to 50",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
