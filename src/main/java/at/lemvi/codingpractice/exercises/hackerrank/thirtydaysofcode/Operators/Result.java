package at.lemvi.codingpractice.exercises.hackerrank.thirtydaysofcode.Operators;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tipAmount = meal_cost * tip_percent / 100;
        double taxAmount = meal_cost * tax_percent / 100;
        double result = (meal_cost + tipAmount + taxAmount);
        System.out.println(Math.round(result));
    }

}
