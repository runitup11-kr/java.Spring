package ch02_pjt_01;

public class MyCalculator {

    public void calculate(int fNum, int sNum, ICalculator calculator) {
        int value = calculator.do0peration(fNum, sNum);
        System.out.println("result : " + value);
    }
}

//    public void calAdd(int fNum, int sNum, CalAdd calAdd) {
//    //    ICalculator calculator = new CalAdd();
//        int value = calAdd.do0peration(fNum, sNum);
//        System.out.println("result : " + value);
//    }
//
//    public void calSub(int fNum, int sNum , CalSub calSub) {
//    //    ICalculator calculator = new CalSub();
//        int value = calSub.do0peration(fNum, sNum);
//        System.out.println("result :" + value);
//    }
//
//    public void calMul(int fNum, int sNum , CalMul calMul ) {
//     //   ICalculator calculator = new CalMul();
//        int value = calMul.do0peration(fNum, sNum);
//        System.out.println("result :" + value);
//
//    }
//
//    public void calDiv(int fNum, int sNum , CalDiv calDiv) {
//     //   ICalculator calculator = new CalDiv();
//        int value = calDiv.do0peration(fNum, sNum);
//        System.out.println("result :" + value);
//    }
//}