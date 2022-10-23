import java.util.ArrayList;

// implement by yourself
public class RangeStatistics implements Statistic{
	private int min;
	private int max;
	private Statistic statistic;
	
	public RangeStatistics(Statistic stat, int min, int max) {
		statistic = stat;
		this.min = min;
		this.max = max;
	}
    
	public double calc(ArrayList<Integer> scoreList) {
		for(int i = 0; i < scoreList.size(); i++) {
			if(scoreList.get(i) < min || max < scoreList.get(i)) scoreList.remove(i);
		}
		return statistic.calc(scoreList);
	}
}