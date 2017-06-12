package io.github.mrairing;

import io.github.mrairing.interpolation.annotations.Interpolated;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println(plus("1", "2", 3));
        System.out.println(plus("1", "2", 3));
        System.out.println(plus("$i"));
    }

    private static String plus(@Interpolated String a, Object... b) {
        return Stream.concat(Stream.of(a), Arrays.stream(b))
                .map(Object::toString)
                .collect(Collectors.joining(",", "[", "]"));
    }
}