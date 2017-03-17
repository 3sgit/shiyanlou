// 2.2.1 SumOfOdd
public class ControlFlowStatementForLoopSumOfOdd {
    public static void main (String [] args) {
        
        int sum = 0;
        for (i=1; i<=1000; i++) {
            if (0==i%2) {
                sum+=i;
            }
        }
        System.out.println("sum of odd " + sum);
    }
}
