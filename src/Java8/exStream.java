package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exStream {
    public static void main(String[] args) {


        List<Integer> list1 = List.of(20, 40, 57, 60, 78, 80);

        List<Integer> list2 = new ArrayList<>();
        list2.add(34);
        list2.add(67);
        list2.add(40);
        list2.add(88);

        List<Integer> list3 = Arrays.asList(23, 44, 54, 65, 76, 86);

        //list1
        //without stream ----->
        List<Integer> listeven = new ArrayList<>();

        for(Integer i: list1){
            if(i%2 == 0){
                listeven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listeven);

        //with Stream API use ----->

        List<Integer> newList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList1 = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(newList1);
    }
}
