/**
 * Created with IntelliJ IDEA
 * Creator: https://github.com/julie-min
 * Date: 2023.04.11
 */

import java.util.Scanner;
public class ShoppingCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력받을겁니다.

        //등장할 대상을 싹 정리해주고 시작한다.
        String itemname; // 품목명
        int num1; // 몇개들
        int num2; // 제품 가격
        int num3; // 있을지도 모르는 배송비
        int max;

        //질문 시작
        System.out.println("구매품목을 입력하세요.");
        itemname = sc.nextLine();

        System.out.println("몇개들이 제품입니까?");
        num1 = sc.nextInt();
        // 하루 1번 사용시 양으로 환산 필요

        System.out.println("제품 가격");
        num2 = sc.nextInt();

        System.out.println("추가 할인이 가능한가요?");

//        System.out.println("배송비가 포함인가요?");
//        System.out.println("포함 / 미포함 또는 O/X 로 대답해주세요.");
//        if (deliveryfee.equals("포함") || deliveryfee.equals("O")) {
//            System.out.println("총 가격: "+num2);
//        } else if (deliveryfee.equals("미포함")|| deliveryfee.equals("X")){
////            String deliveryfee = sc.nextLine(); // 배송비
////            System.out.println("추가되는 배송비를 입력해주세요.");
////            num3 = sc.nextInt();
////            System.out.println("최종 가격: "+num2+num3);
//        }
//
//        System.out.println("쇼핑품목: "+itemname);
//        System.out.println("개당가격: "+((num2)/num1));


    }
}
