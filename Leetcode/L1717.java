class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return process(s, 'a', 'b', x) + process(processRemainingString(s, 'a', 'b', x), 'b', 'a', y);
        } else {
            return process(s, 'b', 'a', y) + process(processRemainingString(s, 'b', 'a', y), 'a', 'b', x);
        }
    }

    private int process(String s, char a, char b, int points) {
        StringBuilder sb = new StringBuilder();
        int score = 0;

        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == a && c == b) {
                sb.deleteCharAt(sb.length() - 1); // Remove the 'a'
                score += points;
            } else {
                sb.append(c);
            }
        }

        return score;
    }

    private String processRemainingString(String s, char a, char b, int points) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == a && c == b) {
                sb.deleteCharAt(sb.length() - 1); // Remove the 'a'
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
