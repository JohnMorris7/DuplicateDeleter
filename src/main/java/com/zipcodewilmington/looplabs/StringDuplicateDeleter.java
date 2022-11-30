package com.zipcodewilmington.looplabs;

import java.util.Objects;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    String[] strArray;

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
        this.strArray = intArray;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int counterTwo = 0;//creating 2nd counter
        for (int i = 0; i < strArray.length; i++) {//for loop to count through
            int counter = 0;//creating 1 counter
            for (int j = 0; j < strArray.length; j++) { //2nd for loop to count how many duplicates there are
                if(Objects.equals(strArray[j], strArray[i])) {//if intarray j while iterating through finds a duplicate its holding on to it
                    counter++;
                }


            }if(counter < maxNumberOfDuplications) {
                counterTwo++;
            }

        }
        String[] result = new String[counterTwo];
        int counterThree = 0;
        for (int i = 0; i < strArray.length; i++) {//for loop to count through
            int counter = 0;
            for (int j = 0; j < strArray.length; j++) { //2nd for loop to count how many duplicates are
                if(Objects.equals(strArray[j], strArray[i])) {//if intarray j while iterating through finds a duplicate its holding on to it
                    counter++;
                }

            }if(counter < maxNumberOfDuplications) {
                result[counterThree]  = strArray[i];
                counterThree++;
            }

        }

        return result;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int counterTwo = 0;//creating 2nd counter
        for (int i = 0; i < strArray.length; i++) {//for loop to count through
            int counter = 0;//creating 1 counter
            for (int j = 0; j < strArray.length; j++) { //2nd for loop to count how many duplicates there are
                if(Objects.equals(strArray[j], strArray[i])) {//if intarray j while iterating through finds a duplicate its holding on to it
                    counter++;
                }


            }if(counter != exactNumberOfDuplications) {
                counterTwo++;
            }

        }
        String[] result = new String[counterTwo];
        int counterThree = 0;
        for (int i = 0; i < strArray.length; i++) {//for loop to count through
            int counter = 0;
            for (int j = 0; j < strArray.length; j++) { //2nd for loop to count how many duplicates are
                if(Objects.equals(strArray[j], strArray[i])) {//if intarray j while iterating through finds a duplicate its holding on to it
                    counter++;
                }

            }if(counter != exactNumberOfDuplications) {
                result[counterThree]  = strArray[i];
                counterThree++;
            }

        }

        return result;
    }
}
