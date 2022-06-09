import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = new String(s.nextLine());
        int start = 0;
        int end = str.length()-1;
        System.out.println(end);
        char temp;
        String rev = "";
        while(start<=end){
            temp = str.charAt(end);
            rev += temp;
            end --;
        }

        System.out.println(rev);
    }
}