package edu.wctc;

public class InteractRoom extends Room implements Interactable{

    public InteractRoom(String name) {
        super(name);
    }

    @Override
    public String interact(Player one) {
        return "You walk up to the type writer and think to yourself 'wish I had an ink ribbon'.";
    }

    @Override
    public String getDescription() {

        return getName() + " " + "You enter a room and you see a bunch of little guys who almost resemble humans jam pikes into each other and then explode. " +
                "There is also a typewriter inside this room";

    }
}
