/**
 * Created by Ryuilhan on 2016. 10. 28..
 */
import java.util.Scanner;

public class ExamVariousArray {
    public static void main(String[] args){
        new ExamVariousArray().start();
    }

    public void start(){
        Scanner scData = new Scanner(System.in);
        int menu = scData.nextInt();
        try {


            System.out.print("1. 두번째로 큰 수 찾기");
            System.out.print("2. 심사 점수 계산");
            System.out.print("3. 학생 총점, 평균값 구하기");
            System.out.print("4. 5층 아파트의 거주자 숫자 구하기");
            System.out.print("5. 겹치지 않는 숫자 10개입력받기");
            System.out.print("6. 종료하기");
            System.out.print("원하는 메뉴는>>");
            new ExamVariousArray().menuInfo(menu);
        }catch (Exception e){
            System.out.println("입력값을 확인하세요.");
        }
    }

    public void menuInfo(int menu){
        switch (menu){
            case 1:
        }
    }
}









