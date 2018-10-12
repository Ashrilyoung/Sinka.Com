/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinka.com;

import java.util.*;

/**
 *
 * @author dwarfonfire
 */
public class DotCom {

    private ArrayList<String> locationCells;
    String name;

    public void setUpLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {

        String result = "miss";
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("You Sunk" + name);
            } else {
                result = "hit";
            }
        }

        return result;

    }
}
