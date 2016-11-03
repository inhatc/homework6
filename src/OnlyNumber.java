import java.util.Scanner;

/**
 * Created by Ryuilhan on 2016. 10. 28..
 */
public class OnlyNumber {
    int count = 0;
    int[] iArray = new int[10];
    Scanner scData = new Scanner(System.in);
    public OnlyNumber(){
        System.out.println("1~100사이의 숫자를 입력하세요");
        this.count(count);
    }

    public void count(int c) {
        for(int i=c; i<10; i++){
            System.out.print(i+1+"번째 숫자 : ");
            iArray[i] = scData.nextInt();
            if(iArray[i]<0 || iArray[i]>100){
                System.out.println("잘못 입력했습니다. 다시 입력하세요.");
                this.count(count);
            }
            else if(this.check(count)==false&&count>=1){
                System.out.println("잘못 입력했습니다. 다시 입력하세요.");
                this.count(count);
            }
            else {
                count++;
                this.count(count);
                return;
            }
        }
        for(int i=9; i>=0; i--){
            System.out.println(i+1+"번째 숫자는 "+iArray[i]);
        }
    }

    public boolean check(int c){
        boolean bData = true;
        for(int i=c; i>0; i--){
            if(iArray[c] == iArray[i-1]){
                bData = false;
            }
        }
        return bData;
    }
}
