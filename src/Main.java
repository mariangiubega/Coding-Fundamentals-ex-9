import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n1:");
        int n1 = input.nextInt();
        input.nextLine();
        System.out.println("n2:");
        int n2 = input.nextInt();
        input.nextLine();
        System.out.println("decalaj:");
        int d = input.nextInt();
        input.nextLine();
        afisazaPerechiPrime(n1,n2,d);
    }

    private static void afisazaPerechiPrime(int n1, int n2, int d){
        n1 = n1<=2 ? 2 : n1;
        for(int i=n1; i<=n2-d; i++){
            if(isPrime(i) && isPrime(i+d))
                System.out.println(i+ " - "+(i+d));
        }
    }
    private static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return  true;
    }

}
