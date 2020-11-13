package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApplication {

    public static void main(String[] args) {
        Prompts prompt = new Prompts();
        prompt.promptUserNumOfPets();
        for (int i = 1; i<= prompt.getNumOfPets();i++) {
            prompt.promptUserPetType();
            prompt.promptUserPetName();
        }
        prompt.printList();
    }
}
