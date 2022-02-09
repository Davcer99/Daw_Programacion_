public class MusicOrganizerTest {
    public static void main(String[] args) {
        MusicOrganizer l1 = new MusicOrganizer();

        l1.addFile("Hola");
        l1.addFile("Que");
        l1.addFile("Tal");
        l1.addFile("Estas");
        System.out.println(l1.getNumberOfFiles()); 
        l1.listFile(2);
        l1.removeFile(1);
        System.out.println(l1.getNumberOfFiles());
        l1.chekIndex(1);
        l1.chekIndex(22);

    }
}
