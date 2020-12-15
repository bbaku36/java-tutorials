import javax.swing.JOptionPane;

public class Switch {
    public static void main(String[] args) {
        int number;// huwisagch

        String numberString;
        numberString = JOptionPane.showInputDialog("Enter birth month(1-12):");

        number = Integer.parseInt(numberString);

        // it's like a IfElse
        // if(huwisagch== utga1){bichleg1;}
        // else if(huwisagch== utga2){bichleg2;}
        // else if(huwisagch== utga3){bichleg3;}
        // else if(huwisagch== utga4){bichleg4;}
        switch (number) {

            case 12:
            case 1:
            case 2:
                JOptionPane.showMessageDialog(null, "Winter ", "birth season" + number,
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;

        }

        System.exit(0);
    }
}
