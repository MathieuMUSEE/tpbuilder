package org.example.factory;

public class Demo {
    public static void main(String[] args) {
        Character warrior = CharacterFactory.createCharacter("warrior", "Mathieu");
        Character mage = CharacterFactory.createCharacter("mage", "Adrien");
        Character archer = CharacterFactory.createCharacter("archer", "Mohamed");

        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(archer);
    }
}

