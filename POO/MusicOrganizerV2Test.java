public class MusicOrganizerV2Test {
    public static void main(String[] args) {
        MusicOrganizerV2 v1 = new MusicOrganizerV2();

        v1.addFile("Lalala");
        v1.addFile("Do it to it");
        v1.addFile("it take long");
        v1.playtMatching("it");
    }
}
