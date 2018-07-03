import java.util.Arrays;

/**
 * Created by Anastasiia Prodan on 29.06.2018.
 */
@SuppressWarnings("WeakerAccess")
public class View {

    //I am not sure, that usage of so many constants is a good idea.
    //In my humble opinion, it will be better to use constants only for frequently used strings
    public static final String CHOOSE_NUMBER_OF_TASK = "Choose number from 1 to 18 for executing one exact task, 19 for executing all tasks or 0 to exit: ";
    public static final String WRONG_INPUT_DATA = "Wrong number of task. Repeat, please.  ";
    public static final String OUTPUT_ARRAY_IN_RIGHT_ORDER = "Array in right order: ";
    public static final String OUTPUT_ARRAY_IN_REVERSE_ORDER = "Array in reverse order: ";
    public static final String SUM = "Sum of elements is: ";
    public static final String MAX_VALUE_IN_ARRAY = "Max value in array is: ";
    public static final String MIN_VALUE_IN_ARRAY = "Min value in array is ";
    public static final String WITH_INDEX = " with index ";
    public static final String SUM_AND_NUMBER_OF_EVEN_ELEMENTS_IN_ARRAY = "Sum and number of even elements of array are: ";
    public static final String SPACE = " ";
    public static final String AND = " and ";
    public static final String SUM_AND_NUMBER_OF_EVEN_ELEMENTS_IN_MASSIVE_FROM_20_TO_30 = "Sum and number of even elements of array from 20 to 30 are: ";
    public static final String AVERAGE_VALUE = "Average value ";
    public static final String NUMBER_OF_ELEMENTS_THAT_BIGGER_THAN_AVERAGE_VALUE = " number of elements bigger than average value are: ";
    public static final String ONLY_POSITIVE_VALUES = "Only positive values in array: ";
    public static final String INCREMENT_POSITIVE_AND_DECREMENT_NEGATIVE = "Increment positive and decrement negative elements: ";
    public static final String SUM_OF_ARRAYS_THE_SAME_LENGTH = "Sum of arrays the same length is: ";
    public static final String NEW_ARRAY = "New array: ";
    public static final String CONCATENATION_ARRAY = "New array as result of concatenation: ";
    public static final String EXCHANGE_POSITIONS_OF_MIN_MAX = "Array with exchanged positions of min and max elements: ";
    public static final String COPY_WITHOUT_MIN_MAX_ELEMENTS = "Copy of main array without min and max elements: ";
    public static final String ONLY_NEGATIVE_VALUES = "Only negative values in array: ";
    public static final String ARRAY_WITH_PAIR_ODD_VALUES = "New array with pair odd values from first and second arrays: ";
    public static final String BYE = "Bye!";
    public static final String TASK1 = "Task № 1: ";
    public static final String TASK2 = "Task № 2: ";
    public static final String TASK3 = "Task № 3: ";
    public static final String TASK4 = "Task № 4: ";
    public static final String TASK5 = "Task № 5: ";
    public static final String TASK6 = "Task № 6: ";
    public static final String TASK7 = "Task № 7: ";
    public static final String TASK8 = "Task № 8: ";
    public static final String TASK9 = "Task № 9: ";
    public static final String TASK10 = "Task № 10: ";
    public static final String TASK11 = "Task № 11: ";
    public static final String TASK12 = "Task № 12: ";
    public static final String TASK13 = "Task № 13: ";
    public static final String TASK14 = "Task № 14: ";
    public static final String TASK15 = "Task № 15: ";
    public static final String TASK16 = "Task № 16: ";
    public static final String TASK17 = "Task № 17: ";
    public static final String TASK18 = "Task № 18: ";


    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageWithIntValueOnTheSameLine(String message, int value) {
        System.out.print(message + value);
    }

    public void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public void printMessageWithDoubleValueOnTheSameLine(String message, double value) { System.out.print(message + value); }
}
