package Lesson3Seminar;

public class Program {
    public static void main(String[] args) {


       /*
        Calculator calculator = new Calculator();

        double result = calculator.sum(10, 82.5f);
        System.out.println(result);

        */


        //Задание 2



        Integer[] array1 = {1, 10};
        Integer[] array2 = {1,2};

        String[] array3 = {"f","s", "a,","v"};
        Integer[] array4 = {1,2};


        Task2 test1 = new Task2(array1, array2);

        Task2 test2 = new Task2(array3, array4);



        System.out.println(test1.compareArrays());

        System.out.println(test2.compareArrays());


        //Задание 3
        String s = "Dog";
        Integer number =22;

        Pair pair = new Pair<>(s, number);

        System.out.println(pair.getT());
        System.out.println(pair.getU());


        Pair pairError = new Pair<>(s, s);

        System.out.println();

        System.out.println("Ошибка, позволяет добавить два объекта одного типа  " + pairError.getT());
        System.out.println("Ошибка, позволяет добавить два объекта одного типа  " + pairError.getU());

        System.out.println( pairError);



    }
}
