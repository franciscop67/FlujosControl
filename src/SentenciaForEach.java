public class SentenciaForEach {
    public static void main(String[] args) {
        //Esta sentencia se ocupa regularmente solo para arreglos

        int [] numeros = {1,3,5,7,9,11,13,15};
        for (int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres =  {"francisco", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pati"}; //Declaracion de Arreglo

        for(String nombre: nombres){
            System.out.println("nombres = " + nombre);
        }
    }
}
