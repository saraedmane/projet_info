package com.edmane.projetinfo;

/**
 * Created by user on 02/04/2018.
 */
import java.util.List;
import java.util.ArrayList;
import com.edmane.projetinfo.Restaurant.*;
public class Grid {
    public List<Case> boxes;
    public Grid() {
        boxes=new ArrayList<Case>();
    }
    public void makeBoxes() {
        Coordinates left=new Coordinates(0,0);
        Coordinates right=new Coordinates(0,0);
        Coordinates upleft=new Coordinates(0,0);
        Coordinates upright=new Coordinates(0,0);
        for (int i=-90;i<90;i++) {
            for (int j=-180;j<180;j++) {
                left.latitude=i;
                left.longitude=j;
                right.latitude=i;
                right.longitude=j+1;
                upleft.latitude=i+1;
                upleft.longitude=j;
                upright.latitude=i+1;
                upright.longitude=j+1;
                boxes.add(new Case(left,right,upleft,upright));
            }
        }

    }
    public void addRestaurant(Restaurant resto) {
        this.boxes.get((int) ((90+Math.floor(resto.latitude))*360 + 180 + Math.floor(resto.longitude))).liste.add(resto);
    }
    public ArrayList<Restaurant> listof(Client client,double distance) {
        ArrayList<Restaurant> result=new ArrayList<Restaurant>();
        List<Restaurant> relevant1=this.boxes.get((int) ((90+Math.floor(client.latitude))*360 + 180 + Math.floor(client.longitude))).liste;
        List<Restaurant> relevant2=this.boxes.get((int) ((90+Math.floor(client.latitude)+1)*360 + 180 + Math.floor(client.longitude))).liste;
        List<Restaurant> relevant3=this.boxes.get((int) ((90+Math.floor(client.latitude)-1)*360 + 180 + Math.floor(client.longitude))).liste;
        List<Restaurant> relevant4=this.boxes.get((int) ((90+Math.floor(client.latitude))*360 + 180 + Math.floor(client.longitude)+1)).liste;
        List<Restaurant> relevant5=this.boxes.get((int) ((90+Math.floor(client.latitude))*360 + 180 + Math.floor(client.longitude)-1)).liste;
        List<Restaurant> relevant6=this.boxes.get((int) ((90+Math.floor(client.latitude)-1)*360 + 180 + Math.floor(client.longitude)-1)).liste;
        List<Restaurant> relevant7=this.boxes.get((int) ((90+Math.floor(client.latitude)-1)*360 + 180 + Math.floor(client.longitude)+1)).liste;
        List<Restaurant> relevant8=this.boxes.get((int) ((90+Math.floor(client.latitude)-1)*360 + 180 + Math.floor(client.longitude)+1)).liste;
        List<Restaurant> relevant9=this.boxes.get((int) ((90+Math.floor(client.latitude)+1)*360 + 180 + Math.floor(client.longitude)-1)).liste;
        List<Restaurant> relevant10=this.boxes.get((int) ((90+Math.floor(client.latitude)+1)*360 + 180 + Math.floor(client.longitude)+1)).liste;
        List<Restaurant> finale=new ArrayList<Restaurant>();
        finale.addAll(relevant1);
        finale.addAll(relevant2);
        finale.addAll(relevant3);
        finale.addAll(relevant3);
        finale.addAll(relevant4);
        finale.addAll(relevant5);
        finale.addAll(relevant6);
        finale.addAll(relevant7);
        finale.addAll(relevant8);
        finale.addAll(relevant9);
        finale.addAll(relevant10);
        for (Restaurant r: finale) {
            if (Locate.distance(client,r)<distance) {
                result.add(r);
            }
        }
        return result;

    }
    }
