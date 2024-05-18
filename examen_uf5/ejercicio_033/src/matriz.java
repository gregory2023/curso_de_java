class Matriz {
    private int[][] matriz;

    public Matriz(int filas, int columnas) {
        this.matriz = new int[filas][columnas];
    }

    public void llenarMatrizAleatoriamente() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10) + 1; // Números aleatorios del 1 al 10
            }
        }
        System.out.println("Matriz creada y llenada con números aleatorios del 1 al 10.");
    }

    public boolean esCuadrada() {
        return matriz.length == matriz[0].length;
    }

    public void mostrarDiagonalPrincipal() {
        System.out.println("Diagonal principal de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

    public int contarNumeros() {
        int cantidad = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                cantidad++;
            }
        }
        return cantidad;
    }
}