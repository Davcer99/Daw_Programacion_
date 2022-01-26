/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
*/
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;


    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages, boolean courseText)
    {
        this.author = bookAuthor;
        this.title = bookTitle;
        this.pages = pages;
        this.refNumber = "";
        this.courseText = courseText;
    }

    // getters
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getPages() {
        return pages;
    }
    public String getRefNumber() {
        return refNumber;
    }
    public int getBorrowed() {
        return borrowed;
    }
    public boolean isCourseText() {
        return courseText;
    }
    
    // Setter

    public void setRefNumber(String refNumber) {
        if (refNumber.length() > 2){
            this.refNumber = refNumber;
        }else{
            System.out.println("The value of ref is invalid");
        }
        
    }

    // print

    public void printAuthor (){
        System.out.println("The Author of the book is: " + this.author);
    }

    public void printTitle () {
        System.out.println("The Title of the book is: "  + this.title);
    }

    // count

    public void borrow (){
        this.borrowed ++;
    }
    
    //details

    public void printDetails (){
       printAuthor(); 
       printTitle();
       System.out.println("Number of pages: " + this.pages);
       System.out.println("Reference: " + this.refNumber);
       System.out.println("Times borrowed: " + this.borrowed);
       if (this.courseText){
           System.out.println("Es un libro usado en clases");
        }else{
            System.out.println("No es un libro usado en clases");
        }
    }
}