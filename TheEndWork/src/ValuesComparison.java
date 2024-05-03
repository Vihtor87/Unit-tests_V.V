class ValuesComparison {
    public static String getComparisonValue(double a, double b) {
        String res = null;
        if (a > b) {
            res = "Первый список имеет большее среднее значение.";
        } else if (a < b) {
            res = "Второй список имеет большее среднее значение.";
        } else {
            res = "Средние значения равны.";
        }
        return res;
    }
}