package com.zipcodewilmington.assessment1.part2;

import com.sun.xml.internal.bind.v2.util.QNameMap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter = 0;
        for (int outsideNum = 0; outsideNum < objectArray.length; outsideNum++){
            if (objectArray[outsideNum].equals(objectToCount)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        StringBuilder noDupes = new StringBuilder();
        for (int index = 0; index < objectArray.length; index++){
            if (!(objectArray[index].equals(objectToRemove))){
                noDupes.append(objectArray[index] + ",");
            }
        }
        String[] removedDupsArray = noDupes.toString().split(",");
        Integer[] backtoInt = new Integer[removedDupsArray.length];


            for (int i = 0; i < backtoInt.length; i++){
                backtoInt[i] = Integer.parseInt(removedDupsArray[i]);

            }

        return backtoInt;

    }



    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Map<Object, Integer> objectMap = new HashMap<>();

        for (Object occurence : objectArray){
            Integer num = objectMap.get(occurence);
            objectMap.put(occurence, num == null ? 1 : num + 1);
        }
        Entry<Object, Integer> maxElement = null;

        for(Entry<Object, Integer> entry : objectMap.entrySet()){
            if (maxElement == null || entry.getValue() > maxElement.getValue()){
                maxElement = entry;
            }
        }
        return maxElement.getKey();

    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Map<Object, Integer> objectMap = new HashMap<>();

        for (Object occurence : objectArray){
            Integer num = objectMap.get(occurence);
            objectMap.put(occurence, num == null ? 1 : num + 1);
        }
        Entry<Object, Integer> maxElement = null;

        for(Entry<Object, Integer> entry : objectMap.entrySet()){
            if (maxElement == null || entry.getValue() < maxElement.getValue()){
                maxElement = entry;
            }
        }
        return maxElement.getKey();
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int objectArrayLength = objectArray.length;
        int objectArrayToAddLength = objectArrayToAdd.length;

        Object[] mergedArray = (Object[]) Array.newInstance(objectArray.getClass().getComponentType(),
                objectArrayLength + objectArrayToAddLength);

        System.arraycopy(objectArray, 0, mergedArray, 0, objectArrayLength);
        System.arraycopy(objectArrayToAdd,0, mergedArray, objectArrayLength, objectArrayToAddLength);

        return mergedArray;


    }
}
