public class SumaIgual {
    public static void main(String[] args) {
        int [] n1= {1,2,3,4};
        int [] n2= {5,6,3,2};
        int j, valor = 3;


        for (int i = 0; i < n1.length; i++) {

            for (j = 0; j < n1.length; j++) {
                
                if (n1[i] + n2[j] == valor){
                    System.out.println(n1[i] + " + " + n2[j]);
                } 
            }
            j= 0;
        } 
    }
}
