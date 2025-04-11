public class ejerciciosRecursivos {

    /*public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int sumaConsecutivos(int n){  //con F5 se ejecuta el programa
        if(n==1){
            return 1;
        }
        int resultadoParcial = sumaConsecutivos(n-1);
        int resultado = n + resultadoParcial;
        return resultado;
    } */



    public int getPotencia (int base, int exponente){
        if (exponente==1){
            return base;
        }
        int resultadoPotencia = getPotencia(base, exponente-1);
        int resultado = base * resultadoPotencia;
        return resultado;
    }


    ////
    
    public int ultimoejerc (int n){
        if (n<10){
            return n;
        }
        int ultimoDigito = n%10;
        int num = n /10;
        return ultimoDigito + ultimoejerc(num);
    }
}

// git add.
//git commit -m
//git push
