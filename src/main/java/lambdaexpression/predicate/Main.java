package lambdaexpression.predicate;

import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        IntPredicate under18 = new IntPredicate() {
            @Override
            public boolean test(int i) {
                if(i < 18){
                    return true;
                }else {
                    return false;
                }
            }
        };

        IntPredicate over18 = i -> i > 18;
        System.out.println(under18.test(20));
        System.out.println(over18.test(20));

        System.out.println((under18).and(over18).test(18));
        System.out.println((under18).or(over18).test(18));
        System.out.println(under18.and(over18).negate().test(18));

    }
}
