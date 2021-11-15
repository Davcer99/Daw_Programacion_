public class MayorDeTres {
    public static void mayor (int n1, int n2, int n3){
        if (n1 > n2 & n1 > n3){
            System.out.println(n1);
        }else if (n2 > n1 & n2 > n3){
            System.out.println(n2);
        }else {
            System.out.println(n3);
        }
    }

    public static void main(String[] args) {
        mayor(2, 8, 4);
    }
}
