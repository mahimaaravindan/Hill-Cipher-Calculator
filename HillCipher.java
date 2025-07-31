import java.util.Scanner;

public class HillCipher {
    static int[][] key = new int[3][3];
    static int[] message = new int[3];
    static int[] result = new int[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3-letter message:");
        String input = sc.nextLine().toUpperCase();

        for (int i = 0; i < 3; i++)
            message[i] = input.charAt(i) - 'A';

        System.out.println("Enter 3x3 key matrix (row by row):");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                key[i][j] = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            result[i] = 0;
            for (int j = 0; j < 3; j++)
                result[i] += key[i][j] * message[j];
            result[i] %= 26;
        }

        System.out.print("Encrypted Text: ");
        for (int i = 0; i < 3; i++)
            System.out.print((char) (result[i] + 'A'));
        sc.close();
    }
}
