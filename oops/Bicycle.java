class Bicycle{
    float speed = 0.0f;
    int gear = 1;
    void changeSpeed(float increment){
        speed += increment;
    }
    void changeGear(int increment){
        gear += increment;
    }
    void applyBreak(int decrease){
        speed -= decrease;
    }
    void printStates() {
        System.out.println("speed:" + speed + " gear:" + gear);
    }
}