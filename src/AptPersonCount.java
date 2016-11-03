import java.util.Scanner;

/**
 * Created by Ryuilhan on 2016. 10. 28..
 */
public class AptPersonCount {
    public AptPersonCount(){
        int[][] iArray = new int[5][3];
        int[] sum = new int[6];
        int[] sum2 = new int[3];
        Scanner scData = new Scanner(System.in);
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                System.out.print((i+1)+"0"+(j+1)+"호에 살고 있는 사람의 숫자");
                iArray[i][j]=scData.nextInt();
                sum[i] += iArray[i][j];
            }
            sum2[0]+=iArray[i][0];
            sum2[1]+=iArray[i][1];
            sum2[2]+=iArray[i][2];
            sum[5]+=sum[i];
        }
        System.out.println("이 아파트에 거주자는 모두" + sum[5]+" 입니다.");
        for(int i=0; i<5; i++){
            System.out.println(i+1+"층에 사는 거주자는 모두" + sum[i]+"명입니다.");
        }
        for(int i=0; i<3; i++){
            System.out.println(i+1+"호 라인에 사는 거주자는 모두 "+sum2[i]+"명");
        }
    }
}
