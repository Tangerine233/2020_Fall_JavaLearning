public class TestMain2 {
    public static void main(String[] args) {
        //CREATE arr[55,65,60,72,45]
        int[] arr = {55,65,60,72,45};
        //CREATE temp
        int temp =0;
        int mini =0;

        /*
        //FOR (j =0; j<4; j++)
        for (int j =0; j<4; j++) {
            //	FOR (i = 0; i<(4-j); i++)
            for (int i = 0; i < (4 - j); i++)
                //		IF (arr[i]>arr[i+1])
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }//		END IF
        }//	END FOR
        */

        //exchange sort
        for (int i=0;i<4;i++){
            temp = arr[i];
            for (int j=i+1;j<5;j++){
                if (arr[j]<arr[i]){
                    arr[i] = arr[j];
                    arr[j] = temp;
                    temp = arr[i];
                }
            }
        }



        /*
        //selection sort
        for (int j =0; j<4; j++) {
            mini = j;
            temp = arr[j];
            for (int i = j + 1; i < 5; i++) {
                if (arr[i] < arr[mini]) {
                    mini = i;
                    temp = arr[i];
                }
            }
            arr[mini] = arr[j];
            arr[j] = temp;
        }
        */

        for (int i = 0; i < 5; i++) System.out.println(arr[i]);

        int x=0;
        x = (int)(Math.random()*100);
        System.out.println("++++"+x);
    }
}
