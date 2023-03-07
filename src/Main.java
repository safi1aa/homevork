import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dni = scan.nextInt();
        switch (dni){
            case 1:
                System.out.println(" Kyrgyzkii");
                break;
            case 2:
                System.out.println(" matematika ");
                break;
            case 3:
                System.out.println(" Russkii");
                break;
            case 4:
                System.out.println(" Chercheniya ");
                break;
            case 5:
                System.out.println(" Fizra ");
                break;
            case 6:
                System.out.println(" Vyxodnoi ");
                break;
            case 7:
                System.out.println(" Vyxodnoi ");
                break;
            default:
                System.out.println("takogo dnya ne sushestvuet");
                break;
        }
    }
}