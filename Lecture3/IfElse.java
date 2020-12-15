
import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {
        String firstnumber;

        String цэрэг;
        String Сурагч;
        String хүүхэд;
        int age;

        firstnumber = JOptionPane.showInputDialog("Тоогоо оруул");
        age = Integer.parseInt(firstnumber);

        цэрэг = "";
        Сурагч = "";
        хүүхэд = "";

        if (age >= 18 && age <= 27) {
            цэрэг = цэрэг + 1;
            JOptionPane.showMessageDialog(null, "цэрэгт тат", цэрэг, JOptionPane.PLAIN_MESSAGE);
        }

        else if (age >= 13 && age <= 15) {
            JOptionPane.showMessageDialog(null, "хичээлээ сайн хий", Сурагч, JOptionPane.INFORMATION_MESSAGE);
        } else if (age >= 5 && age <= 13) {
            хүүхэд = хүүхэд + 1;
            JOptionPane.showMessageDialog(null, "Бага ангийн хүүхэд", хүүхэд, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Нярай хүүхдүүд", хүүхэд, JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }
}
