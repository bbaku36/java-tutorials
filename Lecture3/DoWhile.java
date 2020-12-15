
public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
        boolean anhToo;

        // do{бичлэг}while(нөхцөл) nuhtsuliig suuld shalgadag
        // while (......){........} mnuhtsuliig ehend shalgadag
        do {
            i++;
            anhToo = true;

            for (int x = 2; x <= i / 2; x++)
                if (i % x == 0)
                    anhToo = false;

            if (anhToo)
                System.out.println(i);

        } while (i <= 500);
    }
}
