public class SumaIgual {
    public static void main(String[] args) {
        int [] n1= {1,2,3,4};
        int j, valor = 5;


        for (int i = 0; i < n1.length; i++) {

            for (j = i + 1; j < n1.length; j++) {
                
                if ((n1[i] + n1[j]) == valor){
                    System.out.println(n1[i] + " + " + n1[j]);
                } 
            }
            
        } 
    }
}
