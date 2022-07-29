import java.util.Scanner;

public class MultiplicarNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero a: ");
        int a  = scanner.nextInt();

        System.out.println("Ingresa el numero b: ");
        int b = scanner.nextInt();
        int resultado=0;

        //Verificamos los signos de cada uno, si es positivo o negativo
        boolean positivoB = b > -1;
        boolean positivoA = a > -1;

        //Calculamos el valor absoluto de a
        int absolutoA= positivoA? a:-a; //Equivalente a Math.abs(a);


        //Sumamos tantas veces el valor de b, segun el valor de a
        for (int i = 0; i < absolutoA; i++) {
            resultado =  resultado + b; //Es igual a +=b
        }

        //Si ambos son negativos o si solo a es negativo damos vuelta al signo
        if ((!positivoA && !positivoB) ||  !positivoA){
            resultado =  -resultado;
        }

        System.out.println("El resultado es " + resultado);
    }
}
