package com.edmane.projetinfo;

/**
 * Created by user on 19/04/2018.
 */

public class Main {
    public static void main(String[] args) {
        Client yazid= new Client(48.8503173,2.2943573000000015);
        Restaurant subway=new Restaurant(48.8542986,2.2893794999999955);
        Grid earth= new Grid();
        earth.makeBoxes();
        earth.addRestaurant(subway);
        for(int i=0;i<10000;i++) {
            Restaurant test=generateur();
            earth.addRestaurant(test);
        }
        System.out.print(earth.listof(yazid, 10000));
        System.out.println();
    }
    public static int randomsign() {
        if (Math.random() < 0.5)
            return -1;
        else
            return 1;
    }
    public static Restaurant generateur() {
        Restaurant test=new Restaurant(Math.random()*90*randomsign(),Math.random()*180*randomsign());
        return test;
    }
}
