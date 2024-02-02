package com.shipmonk.hiring.mikesjan;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class SortedLinkedListExampleTest {

    @Test
    public void integerAscendingList() {
        var list = SortedLinkedListFactory.integerAscendingList();

        list.add(5);
        list.addAll(List.of(3, 2, 10));
        list.add(1);

        assertIterableEquals(List.of(1, 2, 3, 5, 10), list);
    }

    @Test
    public void integerDescendingList() {
        var list = SortedLinkedListFactory.integerDescendingList();

        list.add(5);
        list.addAll(List.of(3, 2, 10));
        list.add(1);

        assertIterableEquals(List.of(10, 5, 3, 2, 1), list);
    }

    @Test
    public void stringAscendingList() {
        var list = SortedLinkedListFactory.stringAscendingList();

        list.add("5");
        list.addAll(List.of("3", "2", "10"));
        list.add("1");

        assertIterableEquals(List.of("1", "10", "2", "3", "5"), list);
    }

    @Test
    public void stringDescendingList() {
        var list = SortedLinkedListFactory.stringDescendingList();

        list.add("5");
        list.addAll(List.of("3", "2", "10"));
        list.add("1");

        assertIterableEquals(List.of("5", "3", "2", "10", "1"), list);
    }
}
