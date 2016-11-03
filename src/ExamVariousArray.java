/**
 * Created by Ryuilhan on 2016. 10. 28..
 */
import java.util.Scanner;

public class ExamVariousArray {
    public static void main(String[] args){
        new ExamVariousArray().start();
    }

    public void start(){
        try {
            Scanner scData = new Scanner(System.in);
            System.out.println("1. 두번째로 큰 수 찾기");
            System.out.println("2. 심사 점수 계산");
            System.out.println("3. 학생 총점, 평균값 구하기");
            System.out.println("4. 5층 아파트의 거주자 숫자 구하기");
            System.out.println("5. 겹치지 않는 숫자 10개입력받기");
            System.out.println("6. 종료하기");
            System.out.println("원하는 메뉴는>>");
            int menu = scData.nextInt();
            this.menuInfo(menu);
        }catch (Exception e){
            System.out.println("입력값을 확인하세요.");
        }
    }

    public void menuInfo(int menu){
        switch (menu){
            case 1: new SecondMax(); this.start();
            case 2: new AvgScore(); this.start();
            case 3: new StudentScore(); this.start();
            case 4: new AptPersonCount(); this.start();
            case 5: new OnlyNumber(); this.start();
            case 6: return;
            default: System.out.println("입력값을 확인하세요."); this.start();
        }
    }
}