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
    
    public int moddiv (int n){
        if (n<10){
            return n;
        }
        int ultimoDigito = n%10;
        int num = n /10;
        return ultimoDigito + moddiv(num);
    }  //FUNCIONOOOOOOOOOOOOOO


    public int suman (int numerol){
        if (numerol ==1){
            return numerol;
        }
        System.out.print(numerol + ", ");
        int resta = numerol -1;
        return suman(resta);  //LO LOGREEEEEEEEEEEEEEEEEEEEEEEEEE
    }

    public int reverso(int n2){
        if (n2<10){
            return n2;
        }
        int ultimoDigito = n2%10;
        int num2 = n2 /10;
        System.out.print(ultimoDigito + ", ");
        return reverso(num2);
    }  //FUNCIONOOOOOOOOOOOOOO
}

// git add.
//git commit -m
//git push
