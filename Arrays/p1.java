import java.util.Arrays;

class p1 {
    public static void main(String[] args) {
        int[] SquareNum = new int[10];

        for (int i = 0; i < SquareNum.length; i++) {
            int square = ((i + 1) * (i + 1));
            SquareNum[i] = square;
        }

        System.out.println(Arrays.toString(SquareNum));
        for(int num : SquareNum){
            System.out.println(num);
        }
    }
}
