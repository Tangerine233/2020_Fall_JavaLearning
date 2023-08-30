public class TestClass1 {
    public static double Cal(int[][] arr) {
        int sum = 0;
        int count =0;
        double average = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j =0; j< arr[0].length-1;j++){
            sum = sum + arr[i][j];
            count++;
            }
        }
        average = ((double)sum)/count;
        return average;
    }
}
