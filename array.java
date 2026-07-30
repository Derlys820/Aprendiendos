public class array {
     
    public static void main(String[] args) {
    /*  int [] arrayNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
int contador = 0;
       do{
       
        System.out.println(arrayNumeros[contador]);
        contador++;
       }while(contador < arrayNumeros.length);*/
       
/*
//multiplos de 5
       for(int i=0; i<=10; i++){
        int multiplo = i * 5;
        System.out.println(multiplo);
       } */

        //suma array de 5 numeros

        int[] numeros = {1, 2, 3, 4, 5};
        int suma =0;

        for( int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
            suma += numeros[i];
        }
        System.out.println("La suma es: " + suma);

    }   
}