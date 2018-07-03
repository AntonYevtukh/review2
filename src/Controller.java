    import java.util.Scanner;

/**
 * Created by Anastasiia Prodan on 29.06.2018.
 */
/*
It would be better to move all printing actions to the view, controller should be
responsible only for reaction on user input, all formatted output should be performed by view class.
As example, for the first task with reversed array:
1. Create method public void printArrayInRightReverseOrdersTask1(int[] resultArray) in view class,
   which takes the result of array reverting as its argument and contains all printMessage() methods, that perform
   output.
2. Rename printArrayInRightReverseOrdersTask1(int[] array) in Controller class to something like
   processArrayInRightReverseOrdersTask1(int[] array), and change its content to call only model and view methods:
   {
        int[] reversedArray = model.reverseArray(array);
        view.printArrayInRightReverseOrdersTask1(reversedArray);
   }
 */
@SuppressWarnings({"WeakerAccess", "AccessStaticViaInstance"})
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @SuppressWarnings("InfiniteLoopStatement")
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            executeTasks(inputIntValueWithScanner(sc));
        }
    }

    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(view.CHOOSE_NUMBER_OF_TASK);
        while( ! sc.hasNextInt() && (sc.nextInt() < 0) && (sc.nextInt() > 18)) {
            view.printMessage(view.WRONG_INPUT_DATA + view.CHOOSE_NUMBER_OF_TASK);
            sc.next();
        }
        return sc.nextInt();
    }

    public void printArrayInRightReverseOrdersTask1(int[] array) {
        view.printMessage(view.TASK1);
        view.printMessage(view.SPACE);
        view.printMessage(view.OUTPUT_ARRAY_IN_RIGHT_ORDER);
        view.printArray(array);
        view.printMessage(view.SPACE);
        view.printMessage(view.OUTPUT_ARRAY_IN_REVERSE_ORDER);
        view.printArray(model.reverseArray(array));
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);
    }

    public void countSumOfElementsTask2(int[] array) {
        view.printMessage(view.TASK2);
        view.printMessage(view.SPACE);
        view.printMessageWithIntValueOnTheSameLine(view.SUM, model.countSum(array));
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);
    }

    public void countMaxValueInArrayTask3(int[] array) {
        view.printMessage(view.TASK3);
        view.printMessage(view.SPACE);
        view.printMessageWithIntValueOnTheSameLine(view.MAX_VALUE_IN_ARRAY, model.getMaxValueInArray(array));
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);

    }

    public void countMinValueInArrayTask4(int[] array) {
        view.printMessage(view.TASK4);
        view.printMessage(view.SPACE);
        view.printMessageWithIntValueOnTheSameLine(view.MIN_VALUE_IN_ARRAY, model.getMinValueInArray(array));
        view.printMessageWithIntValueOnTheSameLine(view.WITH_INDEX, model.getIndexOfMinValueInArray(array));
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);
    }

    public void countNumberAndSumOfEvenElementsInArrayTask5(int[] array) {
        view.printMessage(view.TASK5);
        view.printMessage(view.SPACE);
        view.printMessageWithIntValueOnTheSameLine(view.SUM_AND_NUMBER_OF_EVEN_ELEMENTS_IN_ARRAY,
                model.getSumOfEvenElements(array));
        view.printMessageWithIntValueOnTheSameLine(view.AND, model.countNumberOfEvenElements(array));
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);

    }

    public void countNumberAndSumOfEvenElementsOfMassiveFrom20To30Task6(int[] array) {
        view.printMessage(view.TASK6);
        view.printMessage(view.SPACE);
        view.printMessageWithIntValueOnTheSameLine(view.SUM_AND_NUMBER_OF_EVEN_ELEMENTS_IN_MASSIVE_FROM_20_TO_30,
                model.getSumOfEvenElementsFrom20To30(array));
        view.printMessageWithIntValueOnTheSameLine(view.AND, model.countNumberOfEvenElementsFrom20To30(array));
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);

    }

    public void countMaxFromEvenAndMinFromOddElementsTask7(int[] array) {
        view.printMessage(view.TASK7);
        view.printMessage(view.SPACE);
        int maxValue = model.getMaxValueInArray(model.initOfEvenElements(array));
        view.printMessageWithIntValueOnTheSameLine(view.MAX_VALUE_IN_ARRAY, maxValue);
        view.printMessage(view.SPACE);
        int minValue = model.getMinValueInArray(model.initOfOddElements(array));
        view.printMessageWithIntValueOnTheSameLine(view.MIN_VALUE_IN_ARRAY, minValue);
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);
    }

    public void changeSignOfNegativeElementsTask8(int[] array) {
        view.printMessage(view.TASK8);
        view.printMessage(view.SPACE);
        view.printMessage(view.ONLY_POSITIVE_VALUES);
        view.printArray(model.changeSignOfNegativeElements(array));
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);
    }

    public void incrementPositiveAndDecrementNegativeElementsTask9(int[] array) {
        view.printMessage(view.TASK9);
        view.printMessage(view.SPACE);
        view.printMessage(view.INCREMENT_POSITIVE_AND_DECREMENT_NEGATIVE);
        view.printArray(model.incrementPositiveAndDecrementNegativeElements(array));
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);
    }

    public void averageValueAndNumberOfElementsTask10(int[] array) {
        view.printMessage(view.TASK10);
        view.printMessage(view.SPACE);
        double averageValue = model.countSum(array) / array.length;
        view.printMessageWithDoubleValueOnTheSameLine(view.AVERAGE_VALUE, averageValue);
        int numberOfElementBiggerThanAverageValue = model.countNumberOfElementsBiggerThanAverageValue(array);
        view.printMessageWithIntValueOnTheSameLine(view.SPACE + view.AND + view.NUMBER_OF_ELEMENTS_THAT_BIGGER_THAN_AVERAGE_VALUE, numberOfElementBiggerThanAverageValue);
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);
    }

    public void countSumOfArraysTheSameLengthTask11(int[] array) {
        view.printMessage(view.TASK11);
        view.printMessage(view.SPACE);
        view.printMessage(view.OUTPUT_ARRAY_IN_RIGHT_ORDER);
        view.printArray(array);
        view.printMessage(view.SPACE);
        int[] newArray = model.initArray(array.length);
        view.printMessage(view.NEW_ARRAY);
        view.printArray(newArray);
        view.printMessage(view.SPACE);
        int sumOfArraysTheSameLength = model.countSumOfArraysTheSameLength(array, newArray);
        view.printMessageWithIntValueOnTheSameLine(view.SUM_OF_ARRAYS_THE_SAME_LENGTH, sumOfArraysTheSameLength);
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);
    }

    public void createArrayAsConcatenationOfTwoArraysDifferentLengthTask12(int[] mainArray, int[] newArray) {
        view.printMessage(view.TASK12);
        view.printMessage(view.SPACE);
        view.printMessage(view.OUTPUT_ARRAY_IN_RIGHT_ORDER);
        view.printArray(mainArray);
        view.printMessage(view.SPACE);
        view.printMessage(view.OUTPUT_ARRAY_IN_RIGHT_ORDER);
        view.printArray(newArray);
        view.printMessage(view.SPACE);
        view.printMessage(view.CONCATENATION_ARRAY);
        view.printArray(model.getConcatenationOfTwoArrays(mainArray, newArray));
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);
    }

    //assume that we have only one min and only one max value
    public void arrayExchangePositionsOfMinMaxTask13(int[] array) {
        view.printMessage(view.TASK13);
        view.printMessage(view.SPACE);
        view.printMessage(view.OUTPUT_ARRAY_IN_RIGHT_ORDER);
        view.printArray(array);
        view.printMessage(view.SPACE);
        view.printMessageWithIntValueOnTheSameLine(view.MIN_VALUE_IN_ARRAY, model.getMinValueInArray(array));
        view.printMessageWithIntValueOnTheSameLine(view.WITH_INDEX, model.getIndexOfMinValueInArray(array));
        view.printMessage(view.SPACE);
        int maxValue = model.getMaxValueInArray(array);
        view.printMessageWithIntValueOnTheSameLine(view.MAX_VALUE_IN_ARRAY, maxValue);
        int indexOfMaxValue = model.getIndexOfMaxValueInArray(array);
        view.printMessageWithIntValueOnTheSameLine(view.WITH_INDEX, indexOfMaxValue);
        view.printMessage(view.SPACE);
        view.printMessage(view.EXCHANGE_POSITIONS_OF_MIN_MAX);
        int minValue = model.getMinValueInArray(array);
        int indexOfMinValue = model.getIndexOfMinValueInArray(array);
        view.printArray(model.getArrayExchangePositionsOfMinMax(array));
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);
    }

    //assume that we have only one min value and only one max value
    public void copyArrayWithoutMinMaxElementsTask14(int[] array) {
        view.printMessage(view.TASK14);
        view.printMessage(view.SPACE);
        view.printMessage(view.OUTPUT_ARRAY_IN_RIGHT_ORDER);
        view.printArray(array);
        view.printMessage(view.SPACE);
        int maxElement = model.getMaxValueInArray(array);
        int minElement = model.getMinValueInArray(array);
        view.printMessageWithIntValueOnTheSameLine(view.MAX_VALUE_IN_ARRAY, maxElement);
        view.printMessage(view.SPACE);
        view.printMessageWithIntValueOnTheSameLine(view.MIN_VALUE_IN_ARRAY, minElement);
        view.printMessage(view.SPACE);
        view.printMessage(view.COPY_WITHOUT_MIN_MAX_ELEMENTS);
        view.printArray(model.getCopiedArrayWithElementsExceptTwo(array, maxElement, minElement));
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);
    }

    public void divideArrayIntoTwoArraysTask15(int[] array) {
        view.printMessage(view.TASK15);
        view.printMessage(view.SPACE);
        view.printMessage(view.OUTPUT_ARRAY_IN_RIGHT_ORDER);
        view.printArray(array);
        view.printMessage(view.SPACE);
        view.printMessage(view.ONLY_POSITIVE_VALUES);
        view.printArray(model.getArrayOfPositiveElements(array));
        view.printMessage(view.SPACE);
        view.printMessage(view.ONLY_NEGATIVE_VALUES);
        view.printArray(model.getArrayOfNegativeElements(array));
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);
    }

    public void createArrayWithPairOddValuesTask16(int[] array1, int[] array2) {
        view.printMessage(view.TASK16);
        view.printMessage(view.SPACE);
        view.printMessage(view.OUTPUT_ARRAY_IN_RIGHT_ORDER);
        view.printArray(array1);
        view.printMessage(view.SPACE);
        view.printMessage(view.OUTPUT_ARRAY_IN_RIGHT_ORDER);
        view.printArray(array2);
        view.printMessage(view.SPACE);
        view.printMessage(view.ARRAY_WITH_PAIR_ODD_VALUES);
        view.printArray(model.createArrayWithPairOddValues(array1, array2));
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);
    }

    //for this task would be better if you change ARRAY_SIZE in Model on big value(for example, ARRAY_SIZE = 100)
    public void createArrayWithOneMaxMinValueTask17(int[] array) {
        view.printMessage(view.TASK17);
        view.printMessage(view.SPACE);
        view.printMessage(view.OUTPUT_ARRAY_IN_RIGHT_ORDER);
        view.printArray(array);
        view.printMessage(view.SPACE);
        int[] newArray = model.deleteCopiesOfMaxMinValues(array);
        view.printMessageWithIntValueOnTheSameLine(view.MAX_VALUE_IN_ARRAY, model.getMaxValueInArray(array));
        view.printMessage(view.SPACE);
        view.printMessageWithIntValueOnTheSameLine(view.MIN_VALUE_IN_ARRAY, model.getMinValueInArray(array));
        view.printMessage(view.SPACE);
        view.printMessage(view.NEW_ARRAY);
        view.printArray(newArray);
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);
    }

    public void createArrayFromElementsBetweenAverageValuesTask18(int[] array1, int[] array2) {
        view.printMessage(view.TASK18);
        view.printMessage(view.SPACE);
        view.printMessage(view.OUTPUT_ARRAY_IN_RIGHT_ORDER);
        view.printArray(array1);
        view.printMessage(view.SPACE);
        view.printMessage(view.OUTPUT_ARRAY_IN_RIGHT_ORDER);
        view.printArray(array2);
        view.printMessage(view.SPACE);
        view.printMessageWithDoubleValueOnTheSameLine(view.AVERAGE_VALUE, model.countSum(array1) / array1.length);
        view.printMessage(view.SPACE);
        view.printMessageWithDoubleValueOnTheSameLine(view.AVERAGE_VALUE, model.countSum(array2) / array2.length);
        view.printMessage(view.SPACE);
        view.printMessage(view.NEW_ARRAY);
        view.printArray(model.createArrayFromElementsBetweenAverageValues(array1, array2));
        view.printMessage(view.SPACE);
        view.printMessage(view.SPACE);
    }

    public void executeTasks(int numberOfTask) {
        switch (numberOfTask) {
            case 0:
                view.printMessage(view.BYE);
                System.exit(0);
            case 1:
                printArrayInRightReverseOrdersTask1(model.getMainArray());
                break;
            case 2:
                countSumOfElementsTask2(model.getMainArray());
                break;
            case 3:
                countMaxValueInArrayTask3(model.getMainArray());
                break;
            case 4:
                countMinValueInArrayTask4(model.getMainArray());
                break;
            case 5:
                countNumberAndSumOfEvenElementsInArrayTask5(model.getMainArray());
                break;
            case 6:
                countNumberAndSumOfEvenElementsOfMassiveFrom20To30Task6(model.getMainArray());
                break;
            case 7:
                countMaxFromEvenAndMinFromOddElementsTask7(model.getMainArray());
                break;
            case 8:
                changeSignOfNegativeElementsTask8(model.getMainArray());
                break;
            case 9:
                incrementPositiveAndDecrementNegativeElementsTask9(model.getMainArray());
                break;
            case 10:
                averageValueAndNumberOfElementsTask10(model.getMainArray());
                break;
            case 11:
                countSumOfArraysTheSameLengthTask11(model.getMainArray());
                break;
            case 12:
                createArrayAsConcatenationOfTwoArraysDifferentLengthTask12(model.getMainArray(),
                        model.initArray(model.getSizeOfNewArray()));
                break;
            case 13:
                arrayExchangePositionsOfMinMaxTask13(model.getMainArray());
                break;
            case 14:
                copyArrayWithoutMinMaxElementsTask14(model.getMainArray());
                break;
            case 15:
                divideArrayIntoTwoArraysTask15(model.getMainArray());
                break;
            case 16:
                createArrayWithPairOddValuesTask16(model.getMainArray(), model.getArrayForTask16And18());
                break;
            case 17:
                //for this task would be better if you change ARRAY_SIZE in Model on big value(for example, ARRAY_SIZE = 100)
                createArrayWithOneMaxMinValueTask17(model.getArrayForTask17());
                break;
            case 18:
                createArrayFromElementsBetweenAverageValuesTask18(model.getMainArray(), model.getArrayForTask16And18());
                break;
            case 19:
                printArrayInRightReverseOrdersTask1(model.getMainArray());
                countSumOfElementsTask2(model.getMainArray());
                countMaxValueInArrayTask3(model.getMainArray());
                countMinValueInArrayTask4(model.getMainArray());
                countNumberAndSumOfEvenElementsInArrayTask5(model.getMainArray());
                countNumberAndSumOfEvenElementsOfMassiveFrom20To30Task6(model.getMainArray());
                countMaxFromEvenAndMinFromOddElementsTask7(model.getMainArray());
                changeSignOfNegativeElementsTask8(model.getMainArray());
                incrementPositiveAndDecrementNegativeElementsTask9(model.getMainArray());
                averageValueAndNumberOfElementsTask10(model.getMainArray());
                countSumOfArraysTheSameLengthTask11(model.getMainArray());
                createArrayAsConcatenationOfTwoArraysDifferentLengthTask12(model.getMainArray(),
                        model.initArray(model.getSizeOfNewArray()));
                arrayExchangePositionsOfMinMaxTask13(model.getMainArray());
                copyArrayWithoutMinMaxElementsTask14(model.getMainArray());
                divideArrayIntoTwoArraysTask15(model.getMainArray());
                createArrayWithPairOddValuesTask16(model.getMainArray(), model.getArrayForTask16And18());
                createArrayWithOneMaxMinValueTask17(model.getArrayForTask17());
                createArrayFromElementsBetweenAverageValuesTask18(model.getMainArray(), model.getArrayForTask16And18());
        }
    }
}
