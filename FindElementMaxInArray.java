public class FindElementMaxInArray {
    public static void main(String[] args) {
        int[][] array =  {{1,2,3,7}, {4,5,6,3}, {11,13,16,17}};
        System.out.println("Matrix is: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int)(Math.random()*100);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max is:");
        System.out.println(max);
    }
}
