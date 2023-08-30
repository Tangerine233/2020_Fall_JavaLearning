import java.util.Scanner;

public class TestMain3 {
    void classAttendence(){
        //set up scanner
        Scanner sc = new Scanner(System.in);

        //declare values
        int row = 3;
        int column =3;
        String[][] students = new String[row][column];

        //inter students' names on each desk
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print("Student at row "+i+" column "+j+": ");
                students[i][j] = sc.nextLine();
            }
        }
    }

    boolean findStudent(String[][] arr, String student){
        //declare value
        boolean attended = false;
        int row = arr.length;
        int column = arr[0].length;

        //compare each string in the array
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                if (student.equals(arr[i][j])){
                    attended = true;
                    break;
                }
            }
        }

        return attended;
    }
}
