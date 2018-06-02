public class MoneyDemo{
    public static void main(String[] args){
        Money start = new Money();
        Money goal = new Money();
        System.out.println("Enter your current savings:");
        start.readInput();
        goal = start.times(2);
        System.out.println(", or better yet:");
        goal = start.add(goal);
        System.out.println("If you triple that original amount, you will have:");
        goal.writeOutput();
        System.out.println(); //end line bc method does not end the line.
        System.out.println("remember: A penny saved.");
        System.out.println("is a penny earned.");
    }
}