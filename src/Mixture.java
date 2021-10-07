import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Mixture {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();

        while (t>0) {
            int a = input.nextInt();
            int b = input.nextInt();
            Mixture1(a, b);
            t--;
        }

    }
    public static void Mixture1(int a, int b){



        if (a>0 && b>0){
            System.out.println("Solution");

        }
        else if (b>0){
            System.out.println("Liquid");

        }
        else{
            System.out.println("Solid");
        }

    }
}
