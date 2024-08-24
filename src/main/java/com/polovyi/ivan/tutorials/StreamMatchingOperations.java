package com.polovyi.ivan.tutorials;


import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class StreamMatchingOperations {

    public static void main(String[] args) {
        System.out.println("Find first method");

        Optional<Object> example1 = Stream.empty()
                .findFirst();
        // Optional.empty
        System.out.println("example1 = " + example1);

        Optional<Integer> example2 = Stream.of(null, 2, 3)
                .filter(Objects::nonNull) // without filter throws NPE
                .findFirst();
        // Optional[2]
        System.out.println("example2 = " + example2);

        Optional<Integer> example3 = Stream.of(1, 2, 3)
                .findFirst();
        // Optional[1]
        System.out.println("example3 = " + example3);

        Optional<Integer> example4 = Set.of(1, 2, 3).stream()
                .findFirst();
        // Optional[1] or Optional[2] or Optional[3]
        System.out.println("example4 = " + example4);

        System.out.println("Find any method");
        Optional<Integer> example5 = Stream.of(1, 2, 3)
                .findAny();
        // Optional[1]
        System.out.println("example5 = " + example5);

        System.out.println("Any match ");
        boolean example6 = Stream.of(1, 2, 3)
                .anyMatch(n -> n == 1);
        // true
        System.out.println("example6 = " + example6);

        boolean example7 = Stream.of(2, 3)
                .anyMatch(n -> n == 1);
        // false
        System.out.println("example7 = " + example7);

        boolean example8 = Stream.<Integer>empty()
                .anyMatch(n -> n == 1);
        // false
        System.out.println("example8 = " + example8);

        System.out.println("All match ");
        boolean example9 = Stream.of(1, 1, 1)
                .allMatch(n -> n == 1);
        // true
        System.out.println("example9 = " + example9);

        boolean example10 = Stream.of(1, 1, 2)
                .allMatch(n -> n == 1);
        // false
        System.out.println("example10 = " + example10);

        boolean example11 = Stream.of(2, 2, 2)
                .allMatch(n -> n == 1);
        // false
        System.out.println("example11 = " + example11);

        boolean example12 = Stream.<Integer>empty()
                .allMatch(n -> n == 1);
        // true
        System.out.println("example12 = " + example12);

        System.out.println("Non match ");
        boolean example13 = Stream.of(2, 2, 2)
                .noneMatch(n -> n == 1);
        // true
        System.out.println("example13 = " + example13);

        boolean example14 = Stream.of(1, 1, 2)
                .noneMatch(n -> n == 1);
        // false
        System.out.println("example14 = " + example14);

        boolean example15 = Stream.of(1, 1, 1)
                .noneMatch(n -> n == 1);
        // false
        System.out.println("example15 = " + example15);

        boolean example16 = Stream.<Integer>empty()
                .noneMatch(n -> n == 1);
        // true
        System.out.println("example16 = " + example16);

    }
}
