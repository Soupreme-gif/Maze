package edu.wctc;

public class Maze {

    Room currentRoom;
    Player player;
    boolean isFinished = false;

    public Maze(Player player) {

        this.player = player;

        Room exitRoom = new ExitRoom("White Room");

        Room secondRoom = new LootRoom("Fridge Room");
        secondRoom.setWest(exitRoom);

        Room firstRoom = new InteractRoom("Explosion Room");
        firstRoom.setNorth(secondRoom);

        secondRoom.setSouth(firstRoom);
        exitRoom.setEast(secondRoom);



        currentRoom = firstRoom;

    }

    public boolean move(char newDirection)
    {

       if(currentRoom.isValidDirection(newDirection) == true)
       {

           currentRoom = currentRoom.getAdjoiningRoom(newDirection);
           return true;

       }
       else
       {

           return false;

       }

    }

    public boolean isFinished()
    {

        return isFinished == true;

    }


    public String getPlayerInventory()
    {

       return player.getInventory();

    }

    public int getPlayerScore()
    {

        return player.getScore();

    }

    public String getCurrentRoomDescription()
    {

        return currentRoom.getDescription();

    }

    public String getCurrentRoomExits()
    {

        return currentRoom.getExits();

    }

    public String interactWithCurrentRoom()
    {

          if(currentRoom instanceof Interactable)
          {

              return ((Interactable)currentRoom).interact(player);

          }
          else
          {

              return "this room is not interactable.";

          }

    }

    public String lootCurrentRoom()
    {

        if(currentRoom instanceof Lootable)
        {

            return ((Lootable)currentRoom).loot(player);

        }
        else
        {

            return "this room is not lootable.";

        }


    }

    public String exitCurrentRoom()
    {

        if(currentRoom instanceof Exit)
        {

            isFinished = true;
            return ((Exit)currentRoom).exit(player);


        }
        else
        {

            return "this room is not exitable";

        }

    }





}
