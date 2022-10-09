import java.lang.reflect.Array;

public class ConnectArray {
    public static void main(String[] args) {
        int array1[] = new int[3];
        int array2[] = new int[3];
        int array3[] = new int[array1.length + array2.length];
        System.out.println("New array1 list: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100);
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        System.out.println("New array2 list: ");
        for (int i = 0; i < array1.length; i++) {
            array2[i] = (int) (Math.random() * 100);
            System.out.print(array2[i] + "\t");
        }
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 3; i < 6; i++) {
            array3[i] = array2[i-3];
        }
        System.out.println();
        System.out.println("New array3: ");
        for (int a: array3) {
            System.out.println(a);
        }
    }
}
