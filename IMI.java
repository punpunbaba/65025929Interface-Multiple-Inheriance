public class IMI {
    public static void main(String[] args) {
        Player P1 = new Player();
        P1.attack();
        P1.defend();
        P1.castSpell("Fire ball.");
        P1.useWeapon();
    }
}

interface Character {
    void attack();
    void defend();
}

interface Mage {
    void castSpell(String spell);
}

interface Warrior {
    void useWeapon();
}

class Player implements Character,Mage,Warrior{
    
    public void attack(){
        System.out.println("The player attacks the enemy.");
    }

    public void defend(){
        System.out.println("The player defends against the enemy's attack.");
    }

    public void castSpell(String Spell){
        System.out.println("The player casts " + Spell);
    }

    public void useWeapon(){
        System.out.println("The player uses a weapon to attack.");
    }
} 