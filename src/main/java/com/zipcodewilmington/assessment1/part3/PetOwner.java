package com.zipcodewilmington.assessment1.part3;

import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private Pet[] pets;
    private String name;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == (null)) {
                pets[i] = pet;
            }
        }
    }
    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public boolean removePet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if ((pets[i].equals(pet))) {
                pets[i] = null;

                break;
            }

        }
        return false;
    }
    public void sortNullToEnd() {
        int counter = 0;

        Pet[] tempArray = Arrays.copyOf(this.pets, this.pets.length);
        for (int i = 0; i < this.pets.length; i++) {
            if (!(pets[i] == null)) {
                tempArray[counter] = pets[i];
                counter++;
            }
        }
        tempArray[pets.length - 1] = null;
        this.pets = tempArray;

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return null;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        return null;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        return null;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return null;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return null;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return null;
    }
}
