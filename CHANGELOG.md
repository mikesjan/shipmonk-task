# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [1.0.0] - 2024-02-02

### Added

- `SortedLinkedList` interface extending Java `List` interface.
- Default `SortedLinkedListByComparator` implementation that uses `LinkedList` as underlying storage and `Comparator` to properly sort elements.
- `SortedLinkedListFactory` with commonly used factory methods.