import java.util.HashMap;
import java.util.Map;

class L166 {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        // Determine the sign of the result
        if ((numerator < 0) != (denominator < 0)) {
            result.append("-");
        }

        // Use long to avoid overflow with integer division
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // Append the integer part
        result.append(num / den);
        long remainder = num % den;

        if (remainder == 0) {
            return result.toString();
        }

        // Append the decimal point
        result.append(".");

        // Use a map to store remainders and their positions in the result string
        Map<Long, Integer> seenRemainders = new HashMap<>();

        while (remainder != 0) {
            if (seenRemainders.containsKey(remainder)) {
                int index = seenRemainders.get(remainder);
                result.insert(index, "(");
                result.append(")");
                return result.toString();
            }

            seenRemainders.put(remainder, result.length());

            remainder *= 10;
            result.append(remainder / den);
            remainder %= den;
        }

        return result.toString();
    }
}