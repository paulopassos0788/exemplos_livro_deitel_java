import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(isArmstrongNumber(9926315));

    }

    static boolean isArmstrongNumber(int numberToCheck) {

        if (numberToCheck == 0) {
            return true;
        }

        if(numberToCheck < 10){
            return true;
        }

        int[] digits = converterArray(numberToCheck);
        var result = 0;
        var pow = digits.length;

        for (int i = 0; i < digits.length; i++) {
            result += (Math.pow(digits[i], pow));
        }

        if(result == numberToCheck) {
            return true;
        }

        return false;
    }

    private static int[] converterArray(int numberToCheck) {
        String numeroComoString = Integer.toString(numberToCheck);
        int[] arrayDeDigitos = new int[numeroComoString.length()];

        for (int i = 0; i < numeroComoString.length(); i++) {
            arrayDeDigitos[i] = Character.getNumericValue(numeroComoString.charAt(i));
        }

        return arrayDeDigitos;
    }

}