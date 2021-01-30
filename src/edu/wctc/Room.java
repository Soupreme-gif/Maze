package edu.wctc;

public abstract class Room {

    private String name = " ";

    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;


    public Room(String name)
    {

         this.name = name;

    }

    public abstract String getDescription();

    public String getExits()
    {

        String exitRoom = " ";

        if(north != null)
        {

            exitRoom += "north";

        }
        if(south != null)
        {

            exitRoom += "south";

        }
        if(east != null)
        {

            exitRoom += "east";

        }
        if(west != null)
        {

            exitRoom += "west";

        }
        if(up != null)
        {

            exitRoom += "up";

        }
        if(down != null)
        {

            exitRoom += "down";

        }

        return exitRoom;

    }

    public Room getAdjoiningRoom(char direction)
    {

        if(direction == 'n')
        {

            return north;

        }
        else if(direction == 's')
        {

            return south;

        }
        else if(direction == 'e')
        {

            return east;

        }
        else if(direction == 'w')
        {

            return west;

        }
        else if(direction == 'u')
        {

            return up;

        }
        else if(direction == 'd')
        {

            return down;

        }
        else
        {

            return null;

        }

    }

    public Boolean isValidDirection(char direction)
    {

        switch(direction) {

            case 'n': return north != null;

            case 's': return south != null;

            case 'e': return east != null;

            case 'w': return west != null;

            case 'u': return up != null;

            case 'd': return down != null;

            default: return false;

        }

    }

    public String getName() {
        return name;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }
}


