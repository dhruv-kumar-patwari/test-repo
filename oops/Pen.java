public class Pen {
    float refillLevel = 100;
    private boolean capOn = true;
    void takeCapOff(){
        if (capOn)
            capOn = false;
    }
    boolean isCapOff(){
        return !capOn;
    }
    void write(float pages){
        refillLevel -= pages;
    }
    void checkRefill(){
        System.out.println(refillLevel);
    }
}
