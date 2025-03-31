public class MetodoInsercion
{
    public void ordenarAsd(int[] arreglo, boolean pasos)
    {
        int tam = arreglo.length;
        int contComparaciones =0;
        int contCambios =0;
        for (int i = 1; i<tam ; i++)
        {
            int aux = arreglo[i];
            int j = i-1;

            int contCambiosOriginal =contCambios;
            while (j>=0 && aux<arreglo[j])
            {
                contComparaciones++;
                if(pasos) System.out.print("\n\nComparación " + contComparaciones + ": " + arreglo[j] + " > " + aux);
                contCambios++;
                if(pasos) System.out.print("\nIntercambio: " + arreglo[j] + " <-> " + aux);
                arreglo[j+1] = arreglo[j];
                j = j-1;
                arreglo[j+1] = aux;
                if(pasos) {
                    System.out.print("\nEstado actual-> ");
                    imprimirArreglo(arreglo);
                }

            }

            if(contCambiosOriginal==contCambios){
                contComparaciones++;
                if(pasos)
                {
                    System.out.print("\n\nComparación " + contComparaciones + ": " + arreglo[j] + " > " + arreglo[i]);
                    System.out.print("\n(No hay intercambio)");
                    System.out.print("\nEstado actual-> ");
                    imprimirArreglo(arreglo);
                }
            }
        }

        System.out.print("\n\n--FIN DEL METODO--");
        System.out.print("\nArreglo ordenado-> ");
        imprimirArreglo(arreglo);
        System.out.println("\nComparaciones Totales-> " + contComparaciones);
        System.out.println("Cambios Totales-> " + contCambios);
    }


    public void ordenarDes(int[] arreglo, boolean pasos)
    {
        int tam = arreglo.length;
        int contComparaciones =0;
        int contCambios =0;
        for (int i = 1; i<tam ; i++)
        {
            int aux = arreglo[i];
            int j = i-1;

            int contCambiosOriginal =contCambios;
            while (j>=0 && aux>arreglo[j])
            {
                contComparaciones++;
                if(pasos) System.out.print("\n\nComparación " + contComparaciones + ": " + arreglo[j] + " < " + aux);
                contCambios++;
                if(pasos) System.out.print("\nIntercambio: " + arreglo[j] + " <-> " + aux);
                arreglo[j+1] = arreglo[j];
                j = j-1;
                arreglo[j+1] = aux;
                if(pasos) {
                    System.out.print("\nEstado actual-> ");
                    imprimirArreglo(arreglo);
                }

            }

            if(contCambiosOriginal==contCambios){
                contComparaciones++;
                if(pasos)
                {
                    System.out.print("\n\nComparación " + contComparaciones + ": " + arreglo[j] + " < " + arreglo[i]);
                    System.out.print("\n(No hay intercambio)");
                    System.out.print("\nEstado actual-> ");
                    imprimirArreglo(arreglo);
                }
            }
        }

        System.out.print("\n\n--FIN DEL METODO--");
        System.out.print("\nArreglo ordenado-> ");
        imprimirArreglo(arreglo);
        System.out.println("\nComparaciones Totales-> " + contComparaciones);
        System.out.println("Cambios Totales-> " + contCambios);
    }

    public void imprimirArreglo(int[] arreglo)
    {
        for (int i = 0; i < arreglo.length; i++)
            System.out.print(arreglo[i] + " ");
    }
}