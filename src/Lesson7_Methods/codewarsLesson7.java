package Lesson7_Methods;

public class codewarsLesson7 {
    public static void main(String[] args) {

        System.out.println("https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java");
    /*
    We need a function that can transform a number (integer) into a string.
    Examples (input --> output):
    123  --> "123"
    999  --> "999"
    -100 --> "-100"
     */

        int num = 5;
        System.out.println(((Object) num).getClass());
        String result = String.valueOf(num);
        System.out.println(result);
        System.out.println(((Object) result).getClass());
        String result2 = "" + num;
        System.out.println(result2);
        System.out.println(((Object) result2).getClass());

        System.out.println("https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java");
        /*
        Given a non-negative integer, 3 for example, return a string with a murmur:
        "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
         */

        int num2 = 4;
        StringBuffer str = new StringBuffer();
        for (int i = 1; i <= num2; i++){
            str.append(i).append(" sheep...");
        }
        System.out.println(str);
    }

}
