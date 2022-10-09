import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        System.out.println("Input a position want to sum: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
                switch (x) {
                    case 0:
                        sum += array[i][0];
                        break;
                    case 1:
                        sum += array[i][1];
                        break;
                    case 2:
                        sum += array[i][2];
                        break;
                    case 3:
                        sum += array[i][3];
                        break;
                    case 4:
                        sum += array[i][4];
                        break;
                }
        }
        System.out.println(sum);
    }
}

