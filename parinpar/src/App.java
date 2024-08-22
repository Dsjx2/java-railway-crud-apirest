public class App {
    public static void main(String[] args) throws Exception {
        
        int numero = 7;
        String resultado = determinarParidad(numero);
        System.out.println(resultado);    


        menorDiez(32);

    }

    public static String determinarParidad(int numero){
        if(numero %2 == 0){
            return "El numero  "+ numero + " es par.";
        }else{
            return "El numero "+ numero + " es impar.";
        }
    }

    public static void menorDiez(int numero){
        if(numero <10){
            System.out.println("menos");
        }else{
            System.out.println("mas");
        }
    }
        
}

