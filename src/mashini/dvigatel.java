package mashini;


public class dvigatel extends mashina {

    public dvigatel(int power){
        this.power = power;
    }

    public boolean isWorking(int power){
        if (power >0.0) {
            return true;
        }
        return false;
    }
}
