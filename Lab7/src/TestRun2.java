public class TestRun2 {
    public static void main(String[] args) {
        int teamH =0;
        int teamV =0;
        boolean mercy =false;

        do{
            teamH+=7;
            teamV+=3;
            if (teamH>=(teamV+20)) mercy=true;
        }while (!mercy);

        System.out.print(teamH + " to " + teamV);
    }
}
