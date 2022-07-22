package com.bejanalexandru.tema2;

public class Main {
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();

        Runnable carNorthSouth = new Runnable() {
            @Override
            public void run() {
                System.out.println("Car passed on the North-South road.");
            }
        };

        Runnable carEastWest = new Runnable() {
            @Override
            public void run() {
                System.out.println("Car passed on the East-West road.");
            }
        };
        
        trafficLight.carArrived( 1, carNorthSouth, carEastWest);
        trafficLight.carArrived( 1, carNorthSouth, carEastWest);
        trafficLight.carArrived( 2, carNorthSouth, carEastWest);
        trafficLight.carArrived( 2, carNorthSouth, carEastWest);
        trafficLight.carArrived( 2, carNorthSouth, carEastWest);
        trafficLight.carArrived( 2, carNorthSouth, carEastWest);
        trafficLight.carArrived( 1, carNorthSouth, carEastWest);
        trafficLight.carArrived( 1, carNorthSouth, carEastWest);
        trafficLight.carArrived( 1, carNorthSouth, carEastWest);
    }
}
