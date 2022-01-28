/**
 * Heater
 */
public class Heater {

    private double temperatura;
    private double min;
    private double max;
    private double increment;

    public Heater(double min, double max) {
        this.temperatura = 15;
        this.min = min;
        this.max = max;
        this.increment = 5.0;
    }

    //mutadores de temperatura
    public void warmer() {
        if ((this.temperatura + this.increment) <= max){
            this.temperatura += this.increment;
        }
    }

    public void cooler() {
        
        if ((this.temperatura - this.increment) >= min){
            this.temperatura -= this.increment;
        }
    }
    
    //devolver temperatura
    public double getTemperatura() {
        return temperatura;
    }
    
    // set increment

    public void setIncrement(double increment) {
        if (increment >= 1.0 && increment<= 5.0){
            this.increment = increment;
        }
    }
}