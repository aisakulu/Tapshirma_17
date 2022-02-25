package com.peaksoft;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};

        for (Animal a : animals) {
            if (a instanceof Shark) {
                ((Shark) a).attack();

            }
            if (a.getClass().getName().equals("peaksoft.Shark")) {
                ((Shark) a).attack();
            }

            if (a instanceof Turtle) {
                ((Turtle) a).swim();
            }

            if (a.getClass().getName().equals("peaksoft.Turtle")) {
                ((Turtle) a).swim();
            }

            if(a instanceof Eagle){
                ((Eagle) a).fly();


            }if(a.getClass().getName().equals("peaksoft.Eagle")){
                ((Eagle) a).fly();

            }

            Animal[] turle = {new Turtle()};
            Animal[] shark = {new Shark()};
            Animal[] eagle = {new Eagle()};
        }
    }

}
