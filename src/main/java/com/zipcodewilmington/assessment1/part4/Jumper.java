package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        if (j > k){
            return k;
        }
        if (k % j == 0){
            return k;
        }
        if (j % k == 0){
            return k;
        }
        if (j == k){
            return 1;
        }
        if (j < k){
            return (k%j) + 1;
        }
        return j;
    }

}
