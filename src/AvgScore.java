import java.util.Scanner;

/**
 * Created by Ryuilhan on 2016. 10. 28..
 */
public class AvgScore {
    public AvgScore(){
        double[] iArray = new double[10];
        Scanner scData = new Scanner(System.in);
        double max= Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0.0;
        for(int i=0; i<iArray.length; i++){
            System.out.print(i+1+"번째 심사점수 입력 : ");
            iArray[i]=scData.nextDouble();
            if(iArray[i]>max){
                max=iArray[i];
            }
            if(iArray[i]<min){
                min=iArray[i];
            }
            sum+=iArray[i];
        }
        sum = sum - max -min;
        System.out.println("가장큰 점수와 가장 작은 점수를 제외한 8개의 점수 평균은 " + sum/8);
    }
}