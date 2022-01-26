public class BookTest {
    public static void main(String[] args) {
        Book libro = new Book("Paco Luca", "Si te vas", 129, true);
        
        libro.printAuthor();
        libro.printTitle();
        libro.setRefNumber("183285");
        libro.printDetails();
    }
}
