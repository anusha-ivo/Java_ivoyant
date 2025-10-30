public class Labeled_loop {
    public static void main(String[] args) {
        int i;
        int j;
        outer:
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.println(j);
                if (j == 3)
                    break outer;
            }
        }
        System.out.println("----------------------------------------------");
        oute:
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.println(j);

                if (j == 3)

                    continue oute;

            }
        }

    }
}
