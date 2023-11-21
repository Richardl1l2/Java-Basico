import java.util.Scanner;

public class numeroPositivoNegativo {
        public static void main(String[] args) {

        int n1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un  numero: ");
        n1= sc.nextInt();

        if(n1>=1){
            System.out.println("El numero es positivo");

        }else{
            System.out.println("El numero es negativo"); 
        }
        
        }
}
