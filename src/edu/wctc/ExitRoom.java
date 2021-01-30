package edu.wctc;

public class ExitRoom extends Room implements Exit{
    public ExitRoom(String name) {
        super(name);
    }

    @Override
    public String exit(Player one) {

        return "You walk out of the maze not sure how to feel about the events you just witnessed.";

    }

    @Override
    public String getDescription() {
        return getName() + " " + "You gaze upon and entirely white room with a golden candelabra in the middle with what appears" +
                 " to be a swirly hole on top of it.";
    }
}
