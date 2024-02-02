# SortedLinkedList

Java library containing `SortedLinkedList` with one default implementation that uses `Comparator` in order to sort properly.

Library contains factory for the commonly used `SortedLinkedLists`.

## Example Usage

Example usage is shown in [Example Test](src/test/java/com/shipmonk/hiring/mikesjan/SortedLinkedListExampleTest.java).

## Other Resources

[CHANGELOG](CHANGELOG.md)

## Notes for the Interview

- There was no specification for complexity of adding/retrieving elements, so I decided to keep the elements sorted. Both have complexity `O(n)`.
- Adding goes through the list twice - when finding the index and then again when inserting it to the specified position.
  - This is not thread safe!
  - In order to do it only once, ideal approach would be to implement our own LinkedList with its own Nodes.
- It is a library, so I made it more generic:
  - developer can decide to provide his/her own `Comparator`,
  - developer can decide to provide his/her own implementation of underlying `LinkedList`,
  - developer can decide to use different approach of adding elements just by overriding the desired method(s).
- It took me longer than expected, but I wanted to try the GitHub Actions. However, I didn't have time to do more sophisticated (automatic) releasing.