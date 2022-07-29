public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;

        System.out.println("While pre-prueba"); //Primero evalua y despues ejecuta
        while(i <=5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba =  true;

        while (prueba){
            if(i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        System.out.println(" Do-while es post-prueba"); //Primero ejecuta y despues evalua
        prueba =  false;
        do {
            System.out.println("Se ejecuta la menos una vez");
        }while (prueba);


        prueba =  true;
        i=0;
        do{
            if (i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }while(prueba);
    }
}
