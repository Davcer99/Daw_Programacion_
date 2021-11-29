public class Comunes {
    public static void main(String[] args) {
        int [] n1= {1,2,3,4};
        int [] n2= {5,6,3,2};
        int j;

        System.out.print("Los numeros duplicados son los siguientes: ");
        
        for (int i = 0; i < n1.length; i++) {

            for (j = 0; j < n1.length; j++) {
                
                if (n1[i] == n2[j]){
                    System.out.print(n2[j] + " ");
                } 
            }
            j= 0;
        }
    }
}