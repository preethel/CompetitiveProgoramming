import java.util.Scanner;

public class ThreeNPlusOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n);
        while(n>=1){
            if(n%2!=0){
                n = ((n*3) + 1);
                System.out.println(n);
            }
            else{
                n = n / 2 ;
            }
        }
    }
}
