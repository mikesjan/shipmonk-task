package com.shipmonk.hiring.mikesjan;

import lombok.experimental.UtilityClass;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;


/**
 * Factory that helps with the creation of the most common {@link SortedLinkedList} instances.
 */
@UtilityClass
public class SortedLinkedListFactory {

    /**
     * @return default implementation of {@link SortedLinkedList} for Strings that uses
     * natural order {@link Comparator} and plain {@link LinkedList} as an underlying linked list implementation
     */
    public static SortedLinkedListByComparator<String> stringAscendingList() {
        return new SortedLinkedListByComparator<>(Comparator.<String>naturalOrder(), new LinkedList<>());
    }

    /**
     * @return default implementation of {@link SortedLinkedList} for Strings that uses
     * natural order {@link Comparator} and plain {@link LinkedList} as an underlying linked list implementation
     */
    public static SortedLinkedListByComparator<String> stringAscendingList(Collection<String> elements) {
        return new SortedLinkedListByComparator<>(Comparator.naturalOrder(), new LinkedList<>(elements));
    }

    /**
     * @return default implementation of {@link SortedLinkedList} for Strings that uses
     * reverse order {@link Comparator} and plain {@link LinkedList} as an underlying linked list implementation
     */
    public static SortedLinkedListByComparator<String> stringDescendingList() {
        return new SortedLinkedListByComparator<>(Comparator.<String>reverseOrder(), new LinkedList<>());
    }

    /**
     * @return default implementation of {@link SortedLinkedList} for Strings that uses
     * reverse order {@link Comparator} and plain {@link LinkedList} as an underlying linked list implementation
     */
    public static SortedLinkedListByComparator<String> stringDescendingList(Collection<String> elements) {
        return new SortedLinkedListByComparator<>(Comparator.reverseOrder(), new LinkedList<>(elements));
    }

    /**
     * @return default implementation of {@link SortedLinkedList} for Integers that uses
     * natural order {@link Comparator} and plain {@link LinkedList} as an underlying linked list implementation
     */
    public static SortedLinkedListByComparator<Integer> integerAscendingList() {
        return new SortedLinkedListByComparator<>(Comparator.<Integer>naturalOrder(), new LinkedList<>());
    }

    /**
     * @return default implementation of {@link SortedLinkedList} for Integers that uses
     * natural order {@link Comparator} and plain {@link LinkedList} as an underlying linked list implementation
     */
    public static SortedLinkedListByComparator<Integer> integerAscendingList(Collection<Integer> elements) {
        return new SortedLinkedListByComparator<>(Comparator.naturalOrder(), new LinkedList<>(elements));
    }

    /**
     * @return default implementation of {@link SortedLinkedList} for Integers that uses
     * reverse order {@link Comparator} and plain {@link LinkedList} as an underlying linked list implementation
     */
    public static SortedLinkedListByComparator<Integer> integerDescendingList() {
        return new SortedLinkedListByComparator<>(Comparator.<Integer>reverseOrder(), new LinkedList<>());
    }

    /**
     * @return default implementation of {@link SortedLinkedList} for Integers that uses
     * reverse order {@link Comparator} and plain {@link LinkedList} as an underlying linked list implementation
     */
    public static SortedLinkedListByComparator<Integer> integerDescendingList(Collection<Integer> elements) {
        return new SortedLinkedListByComparator<>(Comparator.reverseOrder(), new LinkedList<>(elements));
    }
}
