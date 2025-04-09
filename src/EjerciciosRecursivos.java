public class EjerciciosRecursivos {
    public int llamadasRecursivas=1;
    public int sumaConsecutiva (int n){
        int idActual = llamadasRecursivas++;
        System.out.println("Llamada a"+ idActual+ "con numero n"+n);

    if (n==1){
        return 1;
    }else {
        int resultadoParcial = sumaConsecutiva(n-1);
        int resultado = n + resultadoParcial;
        return resultado;}
    }

    public int suma(int n) {
        int idActual = llamadasRecursivas++;
        System.out.println("Llamada " + idActual + " con número n = " + n);

        if (n == 1) {
            return 1;
        } else {
            //return n + suma(n - 1);
            System.out.println("Llamada a " + idActual + "Llamada recursivamente con n=" + (n-1));
            int resultadoParcial= sumaConsecutiva(n-1);

            int resultado = n + resultadoParcial;
            System.out.println("Llamada a "+ idActual+"sumando"+n+"al resultado de "+ resultadoParcial+"="+resultado); 
            
            System.out.println("Llamada a"+ idActual+"Retorno"+resultado);
            return resultado;
        }
    }
    public static void main(String[] args) {
        EjerciciosRecursivos er = new EjerciciosRecursivos();
        int numero = 5; // Puedes cambiar este valor para probar con otros números
        int resultado = er.suma(numero);
        System.out.println("Resultado final de la suma recursiva de " + numero + ": " + resultado);
    }
}


