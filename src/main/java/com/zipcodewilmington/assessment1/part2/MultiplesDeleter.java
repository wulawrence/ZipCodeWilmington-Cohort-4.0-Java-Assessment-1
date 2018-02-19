package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        StringBuilder noEvens = new StringBuilder();

        for (int i = 0; i < ints.length; i++){
            if(!(ints[i] % 2 == 0)){
                noEvens.append(ints[i] + ",");
            }
        }
        String [] noEven = noEvens.toString().split(",");
        Integer[] intNoEvens = new Integer[noEven.length];
        if (!noEven[0].equals("")){
            for (int i = 0; i < intNoEvens.length; i++){
                intNoEvens[i] = Integer.parseInt(noEven[i]);
            }
        }
        return intNoEvens;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        StringBuilder noOdds = new StringBuilder();

        for (int i = 0; i < ints.length; i++){
            if((ints[i] % 2 == 0)){
                noOdds.append(ints[i] + ",");
            }
        }
        String [] noOdd = noOdds.toString().split(",");
        Integer[] intNoOdd = new Integer[noOdd.length];
        if (!noOdd[0].equals("")){
            for (int i = 0; i < intNoOdd.length; i++){
                intNoOdd[i] = Integer.parseInt(noOdd[i]);
            }
        }
        return intNoOdd;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        StringBuilder noThrees = new StringBuilder();
        for (int i = 0; i < ints.length; i++){
            if(!(ints[i] % 3 == 0)){
                noThrees.append(ints[i] + ",");
            }
        }
        String [] noThree = noThrees.toString().split(",");
        Integer[] intNoT = new Integer[noThree.length];
        if (!noThree[0].equals("")){
            for (int i = 0; i < intNoT.length; i++){
                intNoT[i] = Integer.parseInt(noThree[i]);
            }
        }
        return intNoT;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        StringBuilder noSix = new StringBuilder();
        for (int i = 0; i < ints.length; i++){
            if(!(ints[i] % multiple == 0)){
                noSix.append(ints[i] + ",");
            }
        }
        String [] noThree = noSix.toString().split(",");
        Integer[] intNoT = new Integer[noThree.length];
        if (!noThree[0].equals("")){
            for (int i = 0; i < intNoT.length; i++){
                intNoT[i] = Integer.parseInt(noThree[i]);
            }
        }
        return intNoT;
    }
}
