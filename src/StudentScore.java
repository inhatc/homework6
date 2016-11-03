import java.util.Scanner;

/**
 * Created by Ryuilhan on 2016. 10. 28..
 */
public class StudentScore {
    public StudentScore(){
        int[][] iArray = new int[5][3];
        int sumkor = 0;
        int sumeng = 0;
        int summath = 0;
        int[] sum = new int[5];
        Scanner scData = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.print(i+1+"번 학생 국어, 영어 수학 점수 : ");
            for(int j=0; j<3; j++ ) {
                iArray[i][j]=scData.nextInt();
            }
            sumkor += iArray[i][0];
            sumeng += iArray[i][1];
            summath += iArray[i][2];
            sum[i]= iArray[i][0]+iArray[i][1]+iArray[i][2];
        }
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){

            }
        }
        System.out.println("국어 총점은 "+ sumkor+"이고 평균은 "+sumkor/5);
        System.out.println("영어 총점은 "+ sumeng+"이고 평균은 "+sumeng/5);
        System.out.println("수학 총점은 "+ summath+"이고 평균은 "+summath/5);

        for(int i=0; i<5; i++){
            System.out.println(i+1+"번 학생의 총점은 "+sum[i]+", 평균은 "+sum[i]/3 +" 이다");
        }
    }
}
