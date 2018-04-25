package com.edmane.projetinfo;

/**
 * Created by user on 02/04/2018.
 */
import java.util.List;
import java.util.ArrayList;
public class Case {
        Coordinates upleftcoord;
        Coordinates uprightcoord;
        public Coordinates leftcoord;
        Coordinates rightcoord;
        ArrayList<Restaurant> liste;
        public Case(Coordinates leftbox, Coordinates rightbox, Coordinates upleftbox, Coordinates uprightbox) {
            leftcoord=leftbox;
            rightcoord=rightbox;
            upleftcoord=upleftbox;
            uprightcoord=uprightbox;
            liste=new ArrayList<Restaurant>();
        }
    }

