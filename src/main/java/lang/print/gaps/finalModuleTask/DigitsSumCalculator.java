package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        for (int i = 0; number != 0;) {
            i = number % 10;
            sum += i;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
