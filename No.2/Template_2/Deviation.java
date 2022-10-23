import java.util.ArrayList;

class Deviation implements Statistic {
    public double calc(ArrayList<Integer> scoreList) {
        // implement by yourself
        int sum = 0;
        for(int score : scoreList) sum += score;
        double average = (double)sum / scoreList.size();

        double deviation = 0;
        for(int score : scoreList) deviation += Math.pow(score-average, 2);
        deviation /= scoreList.size();
        deviation = Math.sqrt(deviation);
        return deviation;
    }
}