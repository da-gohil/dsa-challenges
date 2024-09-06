import java.util.Arrays;

class p1 {
    public static void main(String[] args) {
    
        int[] rno = new int[10];
        int length = 0;

        for(int i=0; i < rno.length; i++){
            rno[length] = i;
            length++;
        }

        for(int rollNumbers : rno){
            System.out.println(rollNumbers);
        }
    }
}
