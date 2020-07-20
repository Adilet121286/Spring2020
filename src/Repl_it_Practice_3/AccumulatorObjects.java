package Repl_it_Practice_3;

public class AccumulatorObjects {
    public static void main(String[] args) {
        Accumulator accumulator = new Accumulator(200);

        System.out.println(accumulator);

        accumulator.add(100);

        System.out.println(accumulator);

        accumulator.remove(200);

        System.out.println(accumulator);



    }
}
