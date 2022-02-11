import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * This version can play the files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizerV2
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizerV2()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = files.get(index);
        player.startPlaying(filename);
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }

    //list all files
    public void listAllFiles (){
        for (String cancion : files) {
            System.out.println(cancion);
        }
    }

    // listar las cadenas que contengan algo especifico
    public void listMatching (String match){
        ArrayList<String> listado = getMatching(match);
        
        if (listado.size()== 0){
            System.out.println("No se ha encontrado ninguna canción");
        }else{
            for (int i = 0; i < listado.size(); i++) {
                System.out.println(listado.get(i));
            }
        }
    }

    // play matching 
    public void playtMatching (String match){
        
        for (String elemento : getMatching(match)) {
        
            System.out.println(elemento);
            player.playSample(elemento);
              
        } 
    }

    public ArrayList<String> getMatching(String match){

        ArrayList<String> resultado = new ArrayList<>();

        for (String elemento : files) {
            if (elemento.contains(match)){
                resultado.add(elemento);
            }    
        }
       return resultado;
    }

    public int findFirst(String searchString){
        ArrayList<String> resultado= getMatching(searchString);

        if (resultado.size()== 0){
            return -1;
        }else{
            return files.indexOf(resultado.get(0));
        }
        
    }
}