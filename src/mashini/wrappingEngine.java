package mashini;

public class wrappingEngine extends mashina{
    public wrappingEngine(int power){
        this.power = power;
    }

    public boolean isWorking(int power){
        return false;
    }
}
