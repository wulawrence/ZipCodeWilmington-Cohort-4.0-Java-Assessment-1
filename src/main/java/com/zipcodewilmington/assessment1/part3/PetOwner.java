package com.zipcodewilmington.assessment1.part3;

        import java.util.ArrayList;
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
        if (pets != null){
            for (int i = 0; i <pets.length;i++){
                this.pets = pets;
            }
        }
    }

    public PetOwner(int maxPets){
        this.pets = new Pet[maxPets];
    }

    public PetOwner(Pet[] pets){
        this.pets = pets;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }



    public void addPet(Pet pet) {
        for (int i = 0; i < pets.length; i++){
            pets[i] = pet;
        }
    }
    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for (int i = 0; i < this.pets.length; i++) {
            if ((this.pets[i].equals(pet))) {
                this.pets[i] = null;

                break;
            }

        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for (int i = 0; i < pets.length; i++){
            if(pet.equals(pets[i])){
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        for (int i = 0; i < pets.length; i++){
            if (pets[i].getAge() < pets[i+1].getAge()) {
                return pets[i].getAge();
            }
            return pets[i+1].getAge();
        }

        return null;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        for (int i = 0; i < pets.length; i++){
            if (pets[i].getAge() > pets[i+1].getAge()) {
                return pets[i].getAge();
            }
            return pets[i+1].getAge();
        }

        return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int sum = 0;
        for (Pet pet : this.pets){
            sum += pet.getAge();
        }
        return (float) sum / (pets.length);
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }



}
