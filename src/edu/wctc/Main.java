package edu.wctc;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Player one = new Player();
        Maze dungeon = new Maze(one);
        char directionInput;

        while(dungeon.isFinished == false)
        {

            System.out.println(dungeon.getCurrentRoomDescription());
            System.out.println(dungeon.getCurrentRoomExits());
            System.out.print(">> ");
            directionInput = keyboard.nextLine().toLowerCase(Locale.ROOT).charAt(0);

            if(directionInput == 'i')
            {

                System.out.println(dungeon.interactWithCurrentRoom());

            }
            else if(directionInput == 'l')
            {

                System.out.println(dungeon.lootCurrentRoom());

            }
            else if(directionInput == 'v')
            {

                System.out.println(dungeon.getPlayerInventory());

            }
            else if(directionInput == 'x')
            {

                System.out.println(dungeon.exitCurrentRoom());

            }
            else
            {

               dungeon.move(directionInput);


            }


        }

        System.out.println(dungeon.getPlayerScore());

    }
}
