import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 3, 2, 5, 3, 2};

        System.out.print("Enter element to find frequency: ");
        int key = sc.nextInt();

        int count = 0;

        for (int num : arr)
            if (num == key)
                count++;

        System.out.println("Frequency = " + count);

        sc.close();
    }
}`
