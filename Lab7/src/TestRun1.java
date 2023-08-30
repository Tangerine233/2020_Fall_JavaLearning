public class TestRun1 {
    public static void main(String[] args) {
        int[] arr = {25,10,3,2,1};
        int temp =0;

        //bubble sort

        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }




        //exchange sort
        /*
        for (int i=0;i<5;i++){
            for (int j = i+1; j<5;j++){
                if (arr[j]<arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
         */



        //selection sort
        /*
        int mini =0;
        for (int i =0; i <5; i++){
            mini = i;
            for (int j =i+1; j<5; j++) {
                if (arr[j]<arr[mini]) mini = j;
            }
            if (arr[i]>arr[mini]){
                temp=arr[i];
                arr[i]=arr[mini];
                arr[mini]=temp;
            }
        }
        */


        //result
        for (int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
