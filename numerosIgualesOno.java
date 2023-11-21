import java.util.Scanner;

public class numerosIgualesOno {
    public static void main(String[] args) {

        int n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un primer numero: ");
        n1= sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        n2= sc.nextInt();

        if(n1==n2){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }

        }
    }

    

