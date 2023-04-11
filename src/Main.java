import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();


    }

    private static void task4() {
        System.out.println("Задание 4");
        List<String> words = new ArrayList<>();
        Collections.addAll(words, "ergg","dfgdf","dsfgf","aaa","sdfff","aaa");
        Map<String,Integer> word=words.stream()
                .collect(Collectors.toMap(Function.identity(),s->1,Integer::sum));
        System.out.println(word);
    }

    private static void task3() {
        System.out.println("Задание 3");
        List<String> words = new ArrayList<>();
        Collections.addAll(words, "ergg","dfgdf","dsfgf","aaa","sdfff","aaa");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }

    private static void task2() {
        System.out.println("Задание 2");
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7);
        TreeSet<Integer> numSet = new TreeSet<>(nums);
        for (Integer num : numSet) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }

    private static void task1() {
        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7);
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
