import java.util.Scanner;

public class Watermelon{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float n = scan.nextFloat();
        if(n%2==0 && n>2){
        System.out.println("YES");
        }
        else{
        System.out.println("NO");
        }
    }
}