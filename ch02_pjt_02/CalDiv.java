package ch02_pjt_01;

public class CalDiv implements  ICalculator{
    @Override
    public int do0peration(int firstNum, int secondNum) {
        return secondNum != 0 ? (firstNum / secondNum) : 0;
    }
}
