package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strenght;

public class Orc extends Race {

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;

        if (stat instanceof Strenght){
            resultado = 5;
        }else if (stat instanceof Constitution){
            resultado = 3;
        }else if (stat instanceof Intelligence){
            resultado = -3;
        }

        return resultado;
    }
    
}
