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
    

        System.out.println(); 
        ejerciciosRecursivos ejercicios = new ejerciciosRecursivos(); 
        int base = 2;   //Estas tres lineas sirven para poder nostros dar valores  a la base y exponente, sin la parte de resultado no podr[ia funcionar la [ultima linea]]                                                    
        int exponente = 3;
        int resultado = ejercicios.getPotencia(base, exponente); 
        System.out.println("El resultado es "+ base +"^"+ exponente +"= " + resultado); 
        ////
        
        ejerciciosRecursivos ejercicioultimo = new ejerciciosRecursivos();
        int n = 125;
        int resultadoUltimo = ejercicioultimo.ultimoejerc(n);
        System.out.println("El resultado es: " + resultadoUltimo); 


    }
}
