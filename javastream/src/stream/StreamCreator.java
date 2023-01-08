package javastream.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreator { // Stream 생성
    public static void main(String[] args) {
        // 4. 임의의 난수 생성
        IntStream ints = new Random().ints(5);
        // .ints(스트림 사이즈),  .ints().limit(맥스 사이즈) 같은 역할

        ints.forEach(System.out::println);
    }
}


//        // 1.문자열 배열 선언 및 할당
//        String[] arr = new String[]{"김석현", "이자바", "박코딩"};
//
//        // 문자열 스트림 생성
//        Stream<String> stream = Stream.of(arr); // Stream.of() 혹은 Arrays.stream() 둘다 가능
//
//        // 출력
//        stream.forEach(System.out::println);


//        //2. int형 배열, 스트림 생성
//        int[] intArr = {1,2,3,4,5,6,7};
//        IntStream intStream = Arrays.stream(intArr);
//
//        System.out.println("sum= "+ intStream.sum());
//        // System.out.println("average= "+ intStream.average());
//        // average 연산으로 스트림을 2번 쓰려하니 에러발생 >> (일회성)

//        //3. 컬렉션 스트림 생성
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
//        Stream<Integer> stream = list.stream();
//
//        stream.forEach(System.out::print);

