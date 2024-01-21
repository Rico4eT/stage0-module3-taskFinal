package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reverse = 0;
        for (int i = 0; number != 0;) {
            i = number % 10;
            reverse = reverse * 10 + i;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
