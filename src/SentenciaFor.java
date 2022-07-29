public class SentenciaFor {
    public static void main(String[] args) {

        System.out.println("Sentencia for incremento");
        for (int i=0; i <=10; i++){
            System.out.println("i = " + i);
        }

        System.out.println("Sentencia for decremento");
        for (int i = 10; i >=0; i--) {
            System.out.println("i = " + i);
        }

        System.out.println("Combinar valores dentro del for");
        for (int i = 1, j = 10; i < j; i++,j--) {
            System.out.println(i + " - " + j);
        }

        System.out.println("For para determinar numeros impares");
        for (int i=0; i <=10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("i = " + i);
        }

        System.out.println("For para determinar numeros pares");
        for (int i=0; i <=10; i++){
            if(i % 2 != 0){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
