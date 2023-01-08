package javastream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperator {
    public static void main(String[] args) {
        // List 생성
        List<String> fruitList = new ArrayList<>();
        fruitList.add("김석현");
        fruitList.add("이나무");
        fruitList.add("박코딩");
        
        // ArrayList 생성
        String[] fruitArray = {"김석현", "이나무", "박코딩"};

        //각각 스트림 생성
        Stream<String> ListStream = fruitList.stream();
        Stream<String> ArrayStream = Arrays.stream(fruitArray);

        ListStream.forEach(System.out::print);  // forEach :요소를 순회함.
        ArrayStream.forEach(System.out::print);
    }
}
