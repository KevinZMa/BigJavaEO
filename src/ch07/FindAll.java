package ch07;

import java.util.Arrays;

/**
 * @bj.exercise SC7.4-3
 */
public class FindAll {

    /**
     * Finds the positions of all occurrences of an element in an array.
     *
     * @param values        an array of values
     * @param searchedValue the value to search for
     * @param the           positions of all matches
     */
    int[] findAll(int[] values, int searchedValue) {
        int[] result = new int[values.length];
        int resultSize = 0;

        int pos = -1;
        do {
            pos = findNext(values, searchedValue, pos + 1);
            if (pos >= 0) {
                result[resultSize++] = pos; // insert first then increment
            }
        } while (pos >= 0);

        return Arrays.copyOf(result, resultSize);
    }

    /**
     * Finds the next occurrence of an element in an array.
     *
     * @param values        an array of values
     * @param searchedValue the value to search for
     * @param start         the position at which to start the search
     * @return the position of the first match at position >= start,
     *         or -1 if the element was not found
     */
    int findNext(int[] values, int searchedValue, int start) {
        int pos = start;
        boolean found = false;
        while (pos < values.length && !found) {
            if (values[pos] == searchedValue) {
                found = true;
            } else {
                pos++;
            }
        }
        return found ? pos : -1;
    }
}
