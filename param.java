import java.util.Random;

public class param {
    private String name;
    private int hp;
    private int mp;
    private int strength;
    private int defense;
    private int agility;

    public param(String name) {
        this.name = name;
        Random random = new Random();
        this.hp = random.nextInt(21) + 80;
        this.mp = random.nextInt(11) + 20;
        this.strength = random.nextInt(11) + 10;
        this.defense = random.nextInt(11) + 10;
        this.agility = random.nextInt(11) + 10;
    }

    public void displayStats() {
        System.out.println("Name: " + this.name);
        System.out.println("HP: " + this.hp);
        System.out.println("MP: " + this.mp);
        System.out.println("Strength: " + this.strength);
        System.out.println("Defense: " + this.defense);
        System.out.println("Agility: " + this.agility);
    }

    public static void main(String[] args) {
        param character = new param("Hero");
        character.displayStats();
    }
}
