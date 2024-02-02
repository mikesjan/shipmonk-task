package com.shipmonk.hiring.mikesjan;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * {@link SortedLinkedList} that keeps the elements sorted - sorts the elements when adding them to the list.
 * Elements are sorted with the help of provided {@link Comparator}.
 * Elements are kept in the provided {@link LinkedList}. It means that the provided {@link LinkedList} will be changed
 * when manipulating with instance of this class.
 *
 * @param <E> the type of elements in this list
 */
public class SortedLinkedListByComparator<E> implements SortedLinkedList<E> {
    private final Comparator<E> comparator;
    private final LinkedList<E> delegate;

    public SortedLinkedListByComparator(Comparator<E> comparator, LinkedList<E> delegate) {
        this.comparator = comparator;
        this.delegate = delegate;

        this.delegate.sort(this.comparator);
    }

    /**
     * Add new element to the list to the position based on the order determined by the provided {@link Comparator}.
     *
     * @param newElement element whose presence in this collection is to be ensured
     * @return true if this collection changed as a result of the call
     */
    @Override
    public boolean add(E newElement) {
        int targetIndex = 0;
        for (E currentElement : delegate) {
            if (comparator.compare(currentElement, newElement) > 0) {
                break;
            }

            targetIndex++;
        }

        delegate.add(targetIndex, newElement);

        return true;
    }

    /**
     * Add new elements to the list to the position based on the order determined by the provided {@link Comparator}.
     *
     * @param newElements elements whose presence in this collection is to be ensured
     * @return true if this collection changed as a result of the call
     */
    @Override
    public boolean addAll(Collection<? extends E> newElements) {
        boolean returnValue = false;

        for (E newElement : newElements) {
            returnValue = add(newElement) || returnValue;
        }

        return returnValue;
    }

    // ----------------------- pure delegation -----------------------
    @Override
    public int size() {
        return delegate.size();
    }

    @Override
    public boolean isEmpty() {
        return delegate.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return delegate.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return delegate.iterator();
    }

    @Override
    public Object[] toArray() {
        return delegate.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return delegate.toArray(a);
    }

    @Override
    public boolean remove(Object o) {
        return delegate.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return delegate.containsAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return delegate.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return delegate.retainAll(c);
    }

    @Override
    public void clear() {
        delegate.clear();
    }

    @Override
    public E get(int index) {
        return delegate.get(index);
    }

    @Override
    public E remove(int index) {
        return delegate.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return delegate.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return delegate.lastIndexOf(o);
    }

    @Override
    public ListIterator<E> listIterator() {
        return delegate.listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return delegate.listIterator(index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return delegate.subList(fromIndex, toIndex);
    }
}
