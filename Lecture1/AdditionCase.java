import java.text.DecimalFormat;

public class AdditionCase {
    public static void main(String[] args) {
      
        DecimalFormat twoDigits= new DecimalFormat("0.00");
        
        System.out.println(twoDigits.format((double)2/7));
        }
}
