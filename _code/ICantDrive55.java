package com.hagar.sammy.voa;

public class ICantDrive55 {
    @Getter
    private int speed;
    private boolean increasing; 
    
    public ICantDrive55() {
        this.speed = 0; 
        this.increasing = true; 
    }
    
    public void setSpeed(int newSpeed) {
        if (newSpeed > this.speed) {
            this.increasing = true;
        } else {
            this.increasing = false;
        }
        
        if (newSpeed == 55) {
            if (this.increasing) {
                this.speed = 56;
            } else {
                this.speed = 54;
            }
            
            return; 
        }
        
        this.speed = newSpeed;
    }
}
