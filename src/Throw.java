public class Throw {
    void throwss() throws Exception {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("not able to divide by 0");
            throw e;
        }
        finally {
            System.out.println("error handled by throw only");

        }

    }


    }


