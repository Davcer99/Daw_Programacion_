public class ValoresACero {
    public static void main(String[] args) {
        int[][] matriz;
        matriz = new int [10][10];
        boolean soloCerosFila = true, soloCerosColumnas = false;
        int filasSoloCeros= 0, columnasSoloCero = 0;

        Utilidades.rellenaMatriz(matriz, 0, 0);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != 0){
                    soloCerosFila = false;
                    break; 
                }
                if (matriz.length -1 == j && soloCerosFila == true){
                    filasSoloCeros++;
                }
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[j][i] != 0){
                    soloCerosFila = false;
                    break; 
                }
                if (matriz.length -1 == j && soloCerosFila == true){
                    filasSoloCeros++;
                }
            }
        }
    }
}
