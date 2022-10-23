import java.util.ArrayList;

class Average implements Statistic {
    public double calc(ArrayList<Integer> scoreList) {
        // implement by yourself
        int sum = 0;
        for(int score : scoreList) sum += score;
        return (double)sum / scoreList.size();
    }
}