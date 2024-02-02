package com.shipmonk.hiring.mikesjan;

import java.util.Collection;
import java.util.List;

/**
 * Sorted collection that uses linked list as an underlying implementation.<p>
 *
 * Adheres to the {@link List} interface, but does not allow adding elements to user-specified index since it would break sorting.<p>
 *
 * Complexity of adding/getting elements depends on the underlying implementation and the usage of sorting mechanism.
 *
 * @param <E> the type of elements in this list
 */
public interface SortedLinkedList<E> extends List<E> {

    @Override
    default void add(int index, E element) {
        throw new UnsupportedOperationException("Cannot use specific index when adding element because it would break sorting.");
    }

    @Override
    default boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Cannot use specific index when adding elements because it would break sorting.");
    }

    @Override
    default E set(int index, E element) {
        throw new UnsupportedOperationException("Cannot use specific index when setting element because it would break sorting.");
    }
}
