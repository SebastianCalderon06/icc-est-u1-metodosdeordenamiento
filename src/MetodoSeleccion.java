public class MetodoSeleccion
{
    public void ordenarAsd(int[] arreglo, boolean pasos)
    {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        int aux = 0;
        for (int i = 0; i < n-1; i++) {
            int maxIdx = i;
            int contCambiosOriginal =contCambios;
            for (int j = i + 1; j < n; j++) {

                contComparaciones++;
                if (pasos) System.out.print("\n\nComparación " + contComparaciones + ": " + arreglo[maxIdx] + " > " + arreglo[j]);
                if (arreglo[maxIdx] > arreglo[j]) maxIdx = j;
            }
                if (maxIdx != i)
                {
                    contCambios++;

                    if (pasos) System.out.print("\nIntercambio: " + arreglo[i] + " <-> " + arreglo[maxIdx]);
                    aux = arreglo[maxIdx];
                    arreglo[maxIdx] = arreglo[i];
                    arreglo[i] = aux;
                    if (pasos) {
                        System.out.print("\nEstado actual-> ");
                        imprimirArreglo(arreglo);
                    }
                }

                if (contCambiosOriginal == contCambios) {
                    //    contComparaciones++;
                    if (pasos) {
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
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        int aux = 0;
        for (int i = 0; i < n-1; i++) {
            int maxIdx = i;
            int contCambiosOriginal =contCambios;
            for (int j = i + 1; j < n; j++) {

                contComparaciones++;
                if (pasos) System.out.print("\n\nComparación " + contComparaciones + ": " + arreglo[maxIdx] + " < " + arreglo[j]);
                if (arreglo[maxIdx] < arreglo[j]) maxIdx = j;
            }
            if (maxIdx != i)
            {
                contCambios++;

                if (pasos) System.out.print("\nIntercambio: " + arreglo[i] + " <-> " + arreglo[maxIdx]);
                aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;
                if (pasos) {
                    System.out.print("\nEstado actual-> ");
                    imprimirArreglo(arreglo);
                }
            }

            if (contCambiosOriginal == contCambios) {
                //    contComparaciones++;
                if (pasos) {
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

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");

        }
    }
}