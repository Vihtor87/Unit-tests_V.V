

public class Main {
    public static void main(String[] args) {
        int[] firstArr = TheScanner.getArr();
        int[] secondArr = TheScanner.getArr();

        double res1 = CalculateAverage.getAverageInArr(firstArr);
        double res2 = CalculateAverage.getAverageInArr(secondArr);

        System.out.println(ValuesComparison.getComparisonValue(res1, res2));
    }
}
