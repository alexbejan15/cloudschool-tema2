package com.bejanalexandru.tema2;

import java.util.concurrent.Semaphore;

class TrafficLight {

    private Semaphore greenLight;
    private boolean roadEastWest;
    private boolean roadNorthSouth;

    public TrafficLight() {
        this.greenLight = new Semaphore(1, true);
        this.roadEastWest = true;
        this.roadNorthSouth = false;
    }

    public void carArrived(int roadId, Runnable carNorthSouth, Runnable carEastWest) {
        try {
            greenLight.acquire();
           
            if ((roadId == 1 && roadEastWest)) {
                carEastWest.run();
            }
            
            else if (roadId == 2 && roadNorthSouth) {
                carNorthSouth.run();
            }
            
            else if (roadId == 1 && !roadEastWest) {
                System.out.println("Red light on North-South --> Green light on East-West");
                roadEastWest = true;
                roadNorthSouth = false;
                carEastWest.run();
            } 
            
            else if (roadId == 2 && !roadNorthSouth) {
                System.out.println("Red light on East-West --> Green light on North-South");
                roadNorthSouth = true;
                roadEastWest = false;
                carNorthSouth.run();
            }
            
            greenLight.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}