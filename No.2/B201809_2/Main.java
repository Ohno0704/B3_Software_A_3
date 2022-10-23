public class Main {
    public static void main(String[] args) {
        ScoreData scoreData = new ScoreData();
        scoreData.readFromCSV("scores.csv");
        scoreData.setStatistic(new Average());
        System.out.printf("Average of math = %.2f%n", scoreData.calcStatistic("math"));
        scoreData.setStatistic(new RangeStatistics(new Average(),60, 100));
        System.out.printf("Average of english in [60, 100] = %.2f%n", scoreData.calcStatistic("english"));
        scoreData.setStatistic(new Deviation());
        System.out.printf("Deviation of software = %.2f%n", scoreData.calcStatistic("software"));
        scoreData.setStatistic(new RangeStatistics(new Deviation(), 60, 100));
        System.out.printf("Deviation of software in [60, 100] = %.2f%n", scoreData.calcStatistic("software"));
    }
}
