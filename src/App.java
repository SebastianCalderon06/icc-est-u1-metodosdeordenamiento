import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // instanciar

        MetodoBurbuja MetodoBurbujaClase = new MetodoBurbuja();
        MetodoSeleccion ms = new MetodoSeleccion();
        MetodoInsercion mi = new MetodoInsercion();
        MetodoBurbujaMejorado mbs = new MetodoBurbujaMejorado();

        Scanner scanner = new Scanner(System.in);
        boolean continuar =true;

        while (continuar) {
            int [] arreglo = {10,9,21,5,15,2,-1,0};
            System.out.println("\nSeleccione el método de ordenamiento");
            System.out.println("1 burbuja");
            System.out.println("2 selección");
            System.out.println("3 inserción");
            System.out.println("4 burbuja mejorado");
            System.out.println("5 salir");
            int metodo = getPositive(scanner, "\tIngrese la opción");

            if (metodo==5){
                continuar = false;
                break;

            }

            System.out.println("\nDesea ver los pasos?(true/false)");
            boolean conPasos= scanner.nextBoolean();


            String orden = getValidString(scanner, new String[]{"A","D"}, "\nDesea ordenar ascendentemente (A) o descendentemente (D)");
            boolean ascendente = orden.equalsIgnoreCase("A");
            boolean descendente = orden.equalsIgnoreCase("D");



            switch(metodo){
                case 1:
                    System.out.println("\nMétodo burbuja");
                    System.out.print("Arreglo original-> ");
                    MetodoBurbujaClase.imprimirArreglo(arreglo);
                    if (conPasos == true)
                    {

                    }
                    if (ascendente)
                    {
                        MetodoBurbujaClase.ordenarAsd(arreglo, conPasos);
                    } else if (descendente)
                    {
                        MetodoBurbujaClase.ordenarDes(arreglo, conPasos);
                    }

                    break;

                case 2:
                    System.out.println("\nMétodo de selección");
                    System.out.print("Arreglo original-> ");
                    ms.imprimirArreglo(arreglo);
                    if (conPasos == true)
                    {

                    }
                    if (ascendente)
                    {
                        ms.ordenarAsd(arreglo, conPasos);
                    } else if (descendente)
                    {
                        ms.ordenarDes(arreglo, conPasos);
                    }

                    break;
                case 3:
                    System.out.println("\nMétodo de inserción");
                    System.out.print("Arreglo original-> ");
                    mi.imprimirArreglo(arreglo);
                    if (conPasos == true)
                    {

                    }
                    if (ascendente)
                    {
                        mi.ordenarAsd(arreglo, conPasos);
                    } else if (descendente)
                    {
                        mi.ordenarDes(arreglo, conPasos);
                    }

                    break;

                case 4:
                    System.out.println("\nMétodo burbuja mejorado");
                    System.out.print("Arreglo original-> ");
                    mbs.imprimirArreglo(arreglo);
                    if (conPasos == true)
                    {

                    }
                    if (ascendente)
                    {
                        mbs.ordenarAsd(arreglo, conPasos);
                    } else if (descendente)
                    {
                        mbs.ordenarDes(arreglo, conPasos);
                    }
                    break;

                default:
                    System.out.println("Opción incorrecta");

            }}

    }
    public static int getPositive(Scanner scanner, String message)
    {
        int number;
        do {
            System.out.print(message + ":");
            number = scanner.nextInt();
            if (number <= 0)
            {
                System.out.println("El número debe ser positivo. Intente nuevamente.");
            }
            else if (number > 5)
            {
                System.out.println("Opción incorrecta.");
            }
        } while (number <=0 || number > 5);
        return number;

    }
    public static String getValidString(Scanner scanner, String[] posibles, String message)
    {
        String input;
        boolean valido;
        do {
            System.out.print(message + ":");
            input = scanner.next();
            valido = false;
            for (String posible : posibles) {
                if(input.equalsIgnoreCase(posible)){
                    valido = true;
                    break;
                }
            }
        } while (!valido);
        return input;
}
}