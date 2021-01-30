package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private int score = 0;
    private List<String> Inventory = new ArrayList<String>();


    public void addToInventory(String item)
    {

        Inventory.add(item);

    }

    public String getInventory() {

        if(Inventory.isEmpty())
        {
           return "Nothing is in your inventory at the moment.";
        }

        else
        {

            String listOfInventory = " ";

            for(String i : Inventory)
            {

                listOfInventory += i;


            }

            return listOfInventory;

        }



    }

    public void addToScore()
    {

        score++;

    }

    public int getScore() {

        return score;

    }
}
