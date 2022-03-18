package Character.Stat;

public abstract class Stat {
    
    private int value;

    public Stat(int value) {
        this.value = value;
    }

    //Devuelve el valor
   public int getValue() {
       return value;
   }

   //Aumenta el valor de la característica en 1
   public void increse(){
        this.value ++;
   }

   //Disminuye el valor de la caracteristica en 1 
   public void decrease(){
       this.value --;
   }

   @Override
   // Devuelve el nombre simple de la clase
   public String toString() {
       return getClass().getSimpleName();
   }
}
