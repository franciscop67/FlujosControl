import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Ingresa la cantidad de números a comparar: ");
        int cantidad = scanner.nextInt();

        //Preguntamos si es menor a 10, ya que el mínimo según la tarea es 10
        // (buscar el número menor de minimo 10 valores enteros)
        if(cantidad < 10){
            System.out.println("Error: Debe comparar al menos 10 números enteros!");
        }else{
            int menor =  Integer.MAX_VALUE; // Asignamos un valor máximo por defecto como numero menor para comenzar
            int numero;

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingresa el numero" + (i+1) + ": ");
                numero = scanner.nextInt();
                menor = (numero < menor? numero:menor); //1 < 2147483647 ejemplo
            }

            System.out.println("El numero menor es: " + menor);

            if(menor < 10){
                System.out.println("El numero " + menor + " es menor que 10!");
            }else{
                System.out.println("El numero " + menor + " es igual o mayor que 10!");
            }
        }
    }
}
