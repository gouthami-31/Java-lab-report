public class Evennumbers {
    public static void main(String[] args) {

        System.out.println("Even numbers from 1 to 100 using FOR loop:");
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Even numbers from 1 to 100 using WHILE loop:");
        int i = 1;
        while(i <= 100) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}
