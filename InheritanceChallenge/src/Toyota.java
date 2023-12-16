public class Toyota extends Car{
    public Toyota( int roadService) {
        super("Toyota", "4WD", 5, 5, 5, false);
        this.roadService = roadService;
    }

    private int roadService;

    public void accelerate (int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity ==0){
            stop();
            changeGear(1);
        } else if (newVelocity>0 && newVelocity <=10) {
            changeGear(1);
            
        }else if (newVelocity>10 && newVelocity <=60) {
            changeGear(2);
    }else if (newVelocity>60 && newVelocity <=100) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newVelocity > 0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }

}
