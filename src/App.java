public class App {
    public static void main(String[] args) throws Exception {  //los metodos staticos solo pueden llamar a metodos estaticos, antes en el de abajo no estaba estatico, pero se cambio para que funcione
        
       /*  int n = 5;
        int rresultadoFinal = factorial( n );
        System.out.println("Resultado: " + rresultadoFinal);
    }

    public static int factorial(int n){
        if(n==0){
            System.out.println("Alcanze el caso base");
            return 1;
        } 

        int resultadoParcial = n * factorial(n-1);
        System.out.println("Calculando factorial de: " + n + " * " + "factorial(" + (n-1) + " -1)");
        return resultadoParcial; */



        /*ejerciciosRecursivos ejercicios = new ejerciciosRecursivos();

        int resultadoFibonacci = ejercicios.fibonacci(5); 
        System.out.println("Fibonacci de 10: " + resultadoFibonacci);


        int resultadoSuma = ejercicios.sumaConsecutivos(5); 
        System.out.println("Suma de consecutivos hasta 5: " + resultadoSuma); */
    
        System.out.println("");
        System.out.println(); 
        ejerciciosRecursivos ejercicios = new ejerciciosRecursivos(); 
        int base = 2;   //Estas tres lineas sirven para poder nostros dar valores  a la base y exponente, sin la parte de resultado no podr[ia funcionar la [ultima linea]]                                                    
        int exponente = 10;
        int resultado = ejercicios.getPotencia(base, exponente); 
        System.out.println("El resultado es "+ base +"^"+ exponente +"= " + resultado); 
        ////
        System.out.println("");
        ejerciciosRecursivos ejercicioultimo = new ejerciciosRecursivos();
        int n = 150;
        System.out.println("El numero que sumaremos y resolveremos seraaaa: "+ n);    
        int resultadoUltimo = ejercicioultimo.moddiv(n);
        System.out.println("El resultado esss: " + resultadoUltimo); 


        System.out.println("");
        ejerciciosRecursivos ejercicioreversa = new ejerciciosRecursivos();
        int numerol = 5;
        System.out.println("El numero del que vamos a bajar esss: "+ numerol);
        int resultadoReversa = ejercicioreversa.suman(numerol);
        System.out.println(resultadoReversa);

        System.out.println("");
        ejerciciosRecursivos ejercicioinvertido = new ejerciciosRecursivos();
        int n2 = 2376;
        System.out.println("El número que vamos a invertir esssss: "+ n2);
        int resultadoinvertido = ejercicioinvertido.reverso(n2);
        System.out.println( resultadoinvertido);
    }
}
