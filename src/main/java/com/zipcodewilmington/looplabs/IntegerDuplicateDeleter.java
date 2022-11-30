package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    Integer[] intarray;



    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
        this.intarray = intArray;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        int counterTwo = 0;//creating 2nd counter
        for (int i = 0; i < intarray.length; i++) {//for loop to count through
            int counter = 0;//creating 1 counter
            for (int j = 0; j < intarray.length; j++) { //2nd for loop to count how many duplicates are
                if(intarray[j] == intarray[i]) {//if intarray j while iterating through finds a duplicate its holding on to it
                    counter++;
                }

                //
            }if(counter < maxNumberOfDuplications) {
                counterTwo++;
            }

        }
        Integer[] result = new Integer[counterTwo];
        int counterThree = 0;
        for (int i = 0; i < intarray.length; i++) {//for loop to count through
            int counter = 0;
            for (int j = 0; j < intarray.length; j++) { //2nd for loop to count how many duplicates are
                if(intarray[j] == intarray[i]) {//if intarray j while iterating through finds a duplicate its holding on to it
                    counter++;
                }

            }if(counter < maxNumberOfDuplications) {
                result[counterThree]  = intarray[i];
                counterThree++;
            }

        }

        return result;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        int counterTwo = 0;//creating 2nd counter
        for (int i = 0; i < intarray.length; i++) {//for loop to count through
            int counter = 0;//creating 1 counter
            for (int j = 0; j < intarray.length; j++) { //2nd for loop to count how many duplicates are
                if(intarray[j] == intarray[i]) {//if intarray j while iterating through finds a duplicate its holding on to it
                    counter++;
                }

               //
            }if(counter != exactNumberOfDuplications) {
                counterTwo++;
            }

        }
        Integer[] result = new Integer[counterTwo];
        int counterThree = 0;
        for (int i = 0; i < intarray.length; i++) {//for loop to count through
            int counter = 0;
            for (int j = 0; j < intarray.length; j++) { //2nd for loop to count how many duplicates are
                if(intarray[j] == intarray[i]) {//if intarray j while iterating through finds a duplicate its holding on to it
                    counter++;
                }

            }if(counter != exactNumberOfDuplications) {
                result[counterThree]  = intarray[i];
                counterThree++;
            }

        }

        return result;
    }
}
