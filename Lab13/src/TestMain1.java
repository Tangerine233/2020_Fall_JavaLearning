public class TestMain1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];

        int[][][][] arr2 = new int[6][3][4][5];


        TestClass1 t1 = new TestClass1();

        System.out.println(arr2.length);
        System.out.println(arr2[0].length);
        System.out.println(arr2[0][0].length);
        System.out.println(arr2[0][0][0].length);


        for (int i =0; i< arr.length-1;i++){
            for (int j=0; j<arr[0].length-1;j++){
                arr[i][j] = j+i;
            }
        }

        for (int i =0; i< arr.length-1;i++){
            for (int j=0; j<arr[0].length-1;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }

        System.out.println("\n\n"+ t1.Cal(arr));
    }


}
