public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }

    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod method) {
        String type = String.valueOf(method).toLowerCase();
        if (type.equals("horseback")) {
            return "You're traveling to your destination on " + type + ".";
        } else {
            return describe();
        }
    } 

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character, Destination destination, TravelMethod method) {
        String d1 = describe(character);
        String d2 = describe(method);
        String d3 = describe(destination);
        return d1 + " " + d2 + " " + d3;
    }

    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character character, Destination destination) {
        String d1 = describe(character);
        String d2 = describe();
        String d3 = describe(destination);
        return d1 + " " + d2 + " " + d3;
    }

    public String describe() {
        return "You're traveling to your destination by walking.";
    }
}
