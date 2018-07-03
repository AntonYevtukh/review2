/**
 * Created by Anastasiia Prodan on 29.06.2018.
 */
/*
It wold be better to go along one of the two possible ways:
1. Create separate class for storing the data(arrays) and separate util class for data processing, which
contains public static methods.
2. Redesigning an existing Model class in such a way that it processes the data it encapsulates
You do not need to pass arrays to methods any longer, you can simply reference the private fields inside methods
 */
@SuppressWarnings({"FieldCanBeLocal", "WeakerAccess"})
public class Model {
    private final int ARRAY_SIZE = 20;
    private int[] array = initArray(ARRAY_SIZE);
    private final int SIZE_OF_NEW_ARRAY = 15;
    private int[] arrayForTask16And18 = initArray(ARRAY_SIZE);
    private int[] arrayForTask17 = {1, 1, 1, 1, 8, 8, 8, 8, 8, 6};

    public int[] getMainArray() {
        return array;
    }

    public int getSizeOfNewArray() {
        return SIZE_OF_NEW_ARRAY;
    }

    public int[] getArrayForTask16And18() {
        return arrayForTask16And18;
    }

    public int[] getArrayForTask17() {
        return arrayForTask17;
    }

    public int[] createArray(int arraySize) {
        return new int[arraySize];
    }

    public int[] initArray(int arraySize) {
        int[] newArray = createArray(arraySize);
        for (int i = 0; i < arraySize; i++) {
            newArray[i] = (int) ((Math.random() * 100) - 50);
        }
        return newArray;
    }

    public int[] reverseArray(int[] array) {
        int[] reversedArray = createArray(array.length);
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[j] = array[i];
            j++;
        }
        return reversedArray;
    }

    public int getMaxValueInArray(int[] array) {
        int maxValue = array[0];
        for (int elementOfArray : array) {
            if (maxValue < elementOfArray) {
                maxValue = elementOfArray;
            }
        }
        return maxValue;
    }

    public int countSum(int[] array) {
        int sum = 0;
        for (int elementOfArray : array) {
            sum += elementOfArray;
        }
        return sum;
    }

    public int getMinValueInArray(int[] array) {
        int minValue = array[0];
        for (int elementOfArray : array) {
            if (minValue > elementOfArray) {
                minValue = elementOfArray;
            }
        }
        return minValue;
    }

    //assume that we have only one min value in array

    /*in assumption that array has only one min value, you can use
      break after meeting the min value (line );
      Also, every time you iterate over the array, you call getMinValueInArray(array),
      that may take much time to perform. It wold be better to call it one time and
      save its result to the local variable, then compare array[i] with the value of this variable
    */
    public int getIndexOfMinValueInArray(int[] array) {
        int indexOfMinValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (getMinValueInArray(array) == array[i]) {
                indexOfMinValue = i;
            }
        }
        return indexOfMinValue;
    }

    //assume that we have only one max value in array

    //the same remarks as in the method above
    public int getIndexOfMaxValueInArray(int[] array) {
        int indexOfMaxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (getMaxValueInArray(array) == array[i]) {
                indexOfMaxValue = i;
            }
        }
        return indexOfMaxValue;
    }

    public boolean isEven(int element) {
        return element % 2 == 0;
    }

    public int countNumberOfEvenElements(int[] array) {
        int numberEvenElements = 0;
        for (int elementOfArray : array) {
            if (isEven(elementOfArray)) {
                numberEvenElements++;
            }
        }
        return numberEvenElements;
    }

    public int getSumOfEvenElements(int[] array) {
        int sumOfEvenElements = 0;
        for (int elementOfArray : array) {
            if (isEven(elementOfArray)) {
                sumOfEvenElements += elementOfArray;
            }
        }
        return sumOfEvenElements;
    }

    public boolean isFromTo(int element, double from, double to) {
        return (element >= from) && (element <= to);
    }

    public int countNumberOfEvenElementsFrom20To30(int[] array) {
        int numberOfEvenElementsFrom20To30 = 0;
        for (int elementOfArray : array) {
            if ((isEven(elementOfArray)) && (isFromTo(elementOfArray, 20, 30))) {
                numberOfEvenElementsFrom20To30++;
            }
        }
        return numberOfEvenElementsFrom20To30;
    }

    public int getSumOfEvenElementsFrom20To30(int[] array) {
        int sumOfEvenElementsFrom20To30 = 0;
        for (int elementOfArray : array) {
            if ((isEven(elementOfArray)) && (isFromTo(elementOfArray, 20, 30))) {
                sumOfEvenElementsFrom20To30 += elementOfArray;
            }
        }
        return sumOfEvenElementsFrom20To30;
    }

    //return !isEven(element)
    public boolean isOdd(int element) {
        return element % 2 != 0;
    }

    public int countNumberOfOddElements(int[] array) {
        int numberOfOddElements = 0;
        for (int elementOfArray : array) {
            if (isOdd(elementOfArray)) {
                numberOfOddElements++;
            }
        }
        return numberOfOddElements;
    }

    public int[] initOfEvenElements(int[] array) {
        int[] arrayOfEvenElements = createArray(countNumberOfEvenElements(array));
        int j = 0;
        for (int elementOfArray : array) {
            if (isEven(elementOfArray)) {
                arrayOfEvenElements[j] = elementOfArray;
                j++;
            }
        }
        return arrayOfEvenElements;
    }

    public int[] initOfOddElements(int[] array) {
        int[] arrayOfOddElements = createArray(countNumberOfOddElements(array));
        int j = 0;
        for (int elementOfArray : array) {
            if (isOdd(elementOfArray)) {
                arrayOfOddElements[j] = elementOfArray;
                j++;
            }
        }
        return arrayOfOddElements;
    }

    private int[] cloneArray(int[] array) {
        int[] copyOfMainArray = createArray(array.length);
        System.arraycopy(array, 0, copyOfMainArray, 0, array.length);
        return copyOfMainArray;
    }

    public int[] changeSignOfNegativeElements(int[] array) {
        int[] onlyPositiveElements = cloneArray(array);
        for (int i = 0; i < onlyPositiveElements.length; i++) {
            if (onlyPositiveElements[i] < 0) {
                onlyPositiveElements[i] *= -1;
            }
        }
        return onlyPositiveElements;
    }

    public int[] incrementPositiveAndDecrementNegativeElements(int[] array) {
        int[] copyOfArray = cloneArray(array);
        for (int i = 0; i < copyOfArray.length; i++) {
            if (copyOfArray[i] > 0) {
                copyOfArray[i]++;
            } else if (copyOfArray[i] < 0) {
                copyOfArray[i]--;
            }
        }
        return copyOfArray;
    }

    //You wrote so many reusable methods, why did not you write a method that calculates average values?
    public int countNumberOfElementsBiggerThanAverageValue(int[] array) {
        int numberOfElementsBiggerThanAverageValue = 0;
        int averageValue = countSum(array) / array.length;
        for (int elementOfArray : array) {
            if (elementOfArray > averageValue) {
                numberOfElementsBiggerThanAverageValue++;
            }
        }
        return numberOfElementsBiggerThanAverageValue;
    }

    //The task was another - to create a new array consisting of elements that are the sum of
    //appropriate elements of given arrays, but I am sure you are able to do it
    public int countSumOfArraysTheSameLength(int[] mainArray, int[] newArray) {
        int sumOfArraysTheSameLength = 0;
        for (int i = 0; i < mainArray.length; i++) {
            sumOfArraysTheSameLength += mainArray[i];
            sumOfArraysTheSameLength += newArray[i];
        }
        return sumOfArraysTheSameLength;
    }

    public int[] getConcatenationOfTwoArrays(int[] mainArray, int[] newArray) {
        int[] concatenationArray = createArray(mainArray.length + newArray.length);
        System.arraycopy(mainArray, 0, concatenationArray, 0, mainArray.length);
        System.arraycopy(newArray, 0, concatenationArray, mainArray.length, newArray.length);
        return concatenationArray;
    }

    public int[] getArrayExchangePositionsOfMinMax(int[] array) {
        int[] copyOfArray = createArray(array.length);
        int maxElement = getMaxValueInArray(array);
        int positionOfMaxElement = getIndexOfMaxValueInArray(array);
        int minElement = getMinValueInArray(array);
        int positionOfMinElement = getIndexOfMinValueInArray(array);
        System.arraycopy(array, 0, copyOfArray, 0, array.length);
        copyOfArray[positionOfMinElement] = maxElement;
        copyOfArray[positionOfMaxElement] = minElement;
        return copyOfArray;
    }

    public int[] getCopiedArrayWithElementsExceptTwo(int[] array, int element1, int element2) {
        int[] copyOfArray = createArray(array.length - 2);
        int j = 0;
        for (int elementOfArray : array) {
            if (elementOfArray != element1 && elementOfArray != element2) {
                copyOfArray[j] = elementOfArray;
                j++;
            }
        }
        return copyOfArray;
    }

    public int getNumberOfPositiveElements(int[] array) {
        int numberOfPositiveElements = 0;
        for (int elementOfArray : array) {
            if (elementOfArray > 0) {
                numberOfPositiveElements++;
            }
        }
        return numberOfPositiveElements;
    }

    public int getNumberOfNegativeElements(int[] array) {
        int numberOfNegativeElements = 0;
        for (int elementOfArray : array) {
            if (elementOfArray < 0) {
                numberOfNegativeElements++;
            }
        }
        return numberOfNegativeElements;
    }

    public int[] getArrayOfPositiveElements(int[] array) {
        int[] onlyPositiveElements = createArray(getNumberOfPositiveElements(array));
        int j = 0;
        for (int elementOfArray : array) {
            if (elementOfArray > 0) {
                onlyPositiveElements[j] = elementOfArray;
                j++;
            }
        }
        return onlyPositiveElements;
    }

    public int[] getArrayOfNegativeElements(int[] array) {
        int[] onlyNegativeElements = createArray(getNumberOfNegativeElements(array));
        int j = 0;
        for (int elementOfArray : array) {
            if (elementOfArray < 0) {
                onlyNegativeElements[j] = elementOfArray;
                j++;
            }
        }
        return onlyNegativeElements;
    }

    //if array1 and array2 have odd values on the same position - increment numberOfCommonIndexWithOddValues

    //Cheat for short writing of the "if" statement for this task using the "bitwise and" operations:
    //(array1[i] & array2[i] & 1)
    public int getNumberOfCommonIndexWithOddValues(int[] array1, int[] array2) {
        int numberOfCommonIndexWithOddValues = 0;
        for (int i = 0; i < array1.length; i++) {
            if (isOdd(array1[i]) && isOdd(array2[i])) {
                numberOfCommonIndexWithOddValues++;
            }
        }
        return numberOfCommonIndexWithOddValues;
    }

    public int[] getArrayWithPositionsOfCommonOddValues(int[] array1, int[] array2) {
        int[] arrayWithPositionsOfCommonOddValues = createArray(getNumberOfCommonIndexWithOddValues(array1, array2));
        int j = 0;
        for(int i = 0; i < array1.length; i++) {
            if(isOdd(array1[i]) && isOdd(array2[i])) {
                arrayWithPositionsOfCommonOddValues[j] = i;
                j++;
            }
        }
        return arrayWithPositionsOfCommonOddValues;
    }

    //Probably it would be better to get result directly during the iteration over the array1/array2 without
    //usage of the array containing indexes of common odd values
    public int[] createArrayWithPairOddValues(int[] array1, int[] array2) {
        int[] arrayWithCommonOddValues = createArray(getNumberOfCommonIndexWithOddValues(array1, array2) * 2);
        int[] arrayWithPositionsOfCommonOddValues = getArrayWithPositionsOfCommonOddValues(array1, array2);
        int j = 0;
        for (int arrayWithPositionsOfCommonOddValue : arrayWithPositionsOfCommonOddValues) {
            arrayWithCommonOddValues[j] = array1[arrayWithPositionsOfCommonOddValue];
            j++;
            arrayWithCommonOddValues[j] = array2[arrayWithPositionsOfCommonOddValue];
            j++;
        }
        return arrayWithCommonOddValues;
    }

    public int countNumberOfElementsEqualToValue(int[] array, int value) {
        int numberOfElement = 0;
        for (int elementOfArray : array) {
            if (elementOfArray == value) {
                numberOfElement++;
            }
        }
        return numberOfElement;
    }

    //copyAllElementsExceptDuplicatesOfValue
    public int[] copyAllElementsExceptValue(int[] array, int value, int newArraySize) {
        int[] newArray = createArray(newArraySize);
        int j = 0;
        boolean isCopied = false;
        for (int elementOfArray : array) {
            if (elementOfArray != value) {
                newArray[j] = elementOfArray;
                j++;
            } else if (elementOfArray == value && !isCopied) {
                newArray[j] = elementOfArray;
                j++;
                isCopied = true;
            }
        }
        return newArray;
    }

    public int[] copyAllElementsExceptManyMaxMin(int[] array, int value1, int value2, int newArraySize) {
        int[] newArray = createArray(newArraySize);
        int j = 0;
        boolean isCopiedFirstValue = false;
        boolean isCopiedSecondValue = false;
        for (int elementOfArray : array) {
            if (elementOfArray != value1 && elementOfArray != value2) {
                newArray[j] = elementOfArray;
                j++;
            } else if (elementOfArray == value1 && !isCopiedFirstValue) {
                newArray[j] = elementOfArray;
                j++;
                isCopiedFirstValue = true;
            } else if (elementOfArray == value2 && !isCopiedSecondValue) {
                newArray[j] = elementOfArray;
                j++;
                isCopiedSecondValue = true;
            }
        }
        return newArray;
    }

    @SuppressWarnings("ConstantConditions")
    public int[] deleteCopiesOfMaxMinValues(int[] array) {
        int maxValue = getMaxValueInArray(array);
        int minValue = getMinValueInArray(array);
        int numberOfMaxElements = countNumberOfElementsEqualToValue(array, maxValue);
        int numberOfMinElements = countNumberOfElementsEqualToValue(array, minValue);
        if(numberOfMaxElements == 1 && numberOfMinElements == 1) {
            return array;
        } else if(numberOfMaxElements != 1 && numberOfMinElements == 1){
            int[] newArray = createArray(array.length - numberOfMaxElements + 1);
            newArray = copyAllElementsExceptValue(array, maxValue, newArray.length);
            return newArray;
        }  else if(numberOfMaxElements == 1 && numberOfMinElements != 1) {
            int[] newArray = createArray(array.length - numberOfMinElements + 1);
            newArray = copyAllElementsExceptValue(array, minValue, newArray.length);
            return newArray;
        }  else {
            int[] newArray = createArray(array.length - numberOfMaxElements - numberOfMinElements + 2);
            newArray = copyAllElementsExceptManyMaxMin(array, maxValue, minValue, newArray.length);
            return newArray;
        }
    }

    public int numberOfElementsBetweenTwoAverageValues(double averageValue1, double averageValue2, int[] array) {
        double from = (averageValue1 < averageValue2) ? averageValue1 : averageValue2;
        double to = (averageValue1 > averageValue2) ? averageValue1 : averageValue2;
        int numberOfElementsBetweenTwoAverageValues = 0;
        for (int elementOfArray : array) {
            if (isFromTo(elementOfArray, from, to)) {
                numberOfElementsBetweenTwoAverageValues++;
            }
        }
        return numberOfElementsBetweenTwoAverageValues;
    }

    //It does not work in case when the length of array1 is less then length of array2
    public int[] createArrayFromElementsBetweenAverageValues(int[] array1, int[] array2) {
        int averageValueArray1 = countSum(array1) / array1.length;
        int averageValueArray2 = countSum(array2) / array2.length;
        int numberOfElementsArray1 = numberOfElementsBetweenTwoAverageValues(averageValueArray1, averageValueArray2, array1);
        int numberOfElementsArray2 = numberOfElementsBetweenTwoAverageValues(averageValueArray1, averageValueArray2, array2);
        int[] newArray = createArray(numberOfElementsArray1 + numberOfElementsArray2);
        double from = (averageValueArray1 < averageValueArray2) ? averageValueArray1 : averageValueArray2;
        double to = (averageValueArray1 > averageValueArray2) ? averageValueArray1 : averageValueArray2;
        int j = 0;
        for(int i = 0; i < array1.length; i++) {
            if(isFromTo(array1[i], from, to)) {
                newArray[j] = array1[i];
                j++;
            }
            if(isFromTo(array2[i], from, to)) {
                newArray[j] = array2[i];
                j++;
            }
        }
        return newArray;
    }
}
