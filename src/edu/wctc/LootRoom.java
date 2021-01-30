package edu.wctc;

public class LootRoom extends Room implements Lootable{


    public LootRoom(String name) {
        super(name);
    }

    @Override
    public String loot(Player one) {


        String item = "Talking Cheeseburger";
        one.addToScore();
        one.addToInventory(item);

        return "You made the only logical decision and picked up the talking cheeseburger.";

    }

    @Override
    public String getDescription() {

         return getName() + " " + "You see a room that resembles a freezer with upside down tables and a large green refrigerator.";

    }
}
