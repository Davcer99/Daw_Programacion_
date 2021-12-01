public class ParesImpares {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        int[] pares ={0,0,0,0,0};
        int[] impares ={0,0,0,0,0};
        int cn1=0,cn2=0;

        for (int i = 0; i < numeros.length; i++) {
            if ((numeros[i] % 2) == 0){
                pares[cn1] = numeros[i];
                cn1++;
            }else{
                impares[cn2] = numeros[i];
                cn2++;
            }
        }
        System.out.print("Los numeros pares son: ");
        Utilidades.mostrarArray(pares);
        System.out.print("\nLos numeros impares son: ");
        Utilidades.mostrarArray(impares);
        
    }
}
