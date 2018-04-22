package com.edmane.projetinfo;

/**
 * Created by user on 02/04/2018.
 */
public class Locate {
        public static double distance(Client client, Restaurant resto) {
            return 6378 * (Math.PI/2 - Math.asin(Math.sin((Math.PI * client.latitude) / 180) * Math.sin(Math.PI * resto.latitude) / 180) + Math.cos((Math.PI * client.longitude/180) - (Math.PI * resto.longitude/180)) * Math.cos(Math.PI * resto.latitude / 180) * Math.cos(Math.PI * client.latitude/180));
        }

    }
