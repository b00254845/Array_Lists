
public class ArrayTest {

    public static void main(String[] args) {
        final Integer NUMBER_OF_VALUES = 3;
        Integer[] values = new Integer[NUMBER_OF_VALUES];

        for (Integer value = 0; value < values.length; value++) {
            values[value] = Input.getInteger("Enter a value: ");
        }

        for (Integer value = 0; value < values.length; value++) {
            System.out.println(values[value]);
        }

        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
