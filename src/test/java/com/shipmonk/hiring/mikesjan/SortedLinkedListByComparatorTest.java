package com.shipmonk.hiring.mikesjan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
public class SortedLinkedListByComparatorTest {
    @Mock
    private Comparator<Integer> comparatorMock;
    @Mock
    private LinkedList<Integer> delegateMock;

    @Test
    public void construct_shouldSort() {
        // Given
        var comparator = Comparator.<Integer>naturalOrder();
        var delegate = new LinkedList<>(List.of(1, 3, 5, 2));

        // When
        var list = new SortedLinkedListByComparator<>(comparator, delegate);

        // Then
        assertIterableEquals(List.of(1, 2, 3, 5), list);
        assertIterableEquals(List.of(1, 2, 3, 5), delegate);
    }

    @Test
    public void add_shouldSort() {
        // Given
        var comparator = Comparator.<Integer>naturalOrder();
        var delegate = new LinkedList<Integer>();
        var list = new SortedLinkedListByComparator<>(comparator, delegate);

        // When
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);

        // Then
        assertIterableEquals(List.of(1, 2, 3, 5), list);
        assertIterableEquals(List.of(1, 2, 3, 5), delegate);
    }

    @Test
    public void addAll_shouldSort() {
        // Given
        var comparator = Comparator.<Integer>naturalOrder();
        var delegate = new LinkedList<Integer>();
        var list = new SortedLinkedListByComparator<>(comparator, delegate);

        // When
        list.addAll(List.of(1, 3, 5, 2));

        // Then
        assertIterableEquals(List.of(1, 2, 3, 5), list);
        assertIterableEquals(List.of(1, 2, 3, 5), delegate);
    }

    @Test
    public void add_toIndex_shouldThrow() {
        // Given
        var list = new SortedLinkedListByComparator<>(comparatorMock, delegateMock);

        // When + Then
        assertThrows(UnsupportedOperationException.class, () -> list.add(0, 5));
    }

    @Test
    public void addAll_toIndex_shouldThrow() {
        // Given
        var list = new SortedLinkedListByComparator<>(comparatorMock, delegateMock);

        // When + Then
        assertThrows(UnsupportedOperationException.class, () -> list.addAll(0, List.of(5)));
    }

    @Test
    public void set_shouldThrow() {
        // Given
        var list = new SortedLinkedListByComparator<>(comparatorMock, delegateMock);

        // When + Then
        assertThrows(UnsupportedOperationException.class, () -> list.set(0, 5));
    }

    @Test
    public void size_shouldDelegate() {
        // Given
        var list = new SortedLinkedListByComparator<>(comparatorMock, delegateMock);

        // When
        list.size();

        // Then
        verify(delegateMock).size();
    }

    @Test
    public void contains_shouldDelegate() {
        // Given
        var list = new SortedLinkedListByComparator<>(comparatorMock, delegateMock);
        int parameter = 10;

        // When
        list.contains(parameter);

        // Then
        verify(delegateMock).contains(parameter);
    }

    // other tests that verify correct delegation...
}
