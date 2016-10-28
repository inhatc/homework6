import java.util.Scanner;

/**
 * Created by Ryuilhan on 2016. 10. 28..
 */
public class SecondMax {
    public SecondMax(){
        Scanner scData = new Scanner(System.in);
        int max=0;
        int max2=0;
        int temp=0;
        int[] iArray = new int[10];
        for(int i=0; i<iArray.length; i++) {
            System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
            iArray[i] = scData.nextInt();
            for(int j=0; j<i; j++){
                if(iArray[0]<iArray[j]){
                    max = iArray[j];
                    iArray[0]=max;
                }
            }
        }
        for(int i=1; i<iArray.length; i++){
            if(iArray[1]<iArray[i]&&max!=iArray[i]){
                max2=iArray[i];
                temp=i;
            }
        }
        System.out.println("두번째로 큰 수는"+temp+1+"번째수 "+max2+"입니다.");

    }
}
