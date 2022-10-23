import java.io.*;
import java.util.*;

class ScoreData {
    private HashMap<String, ArrayList<Integer>> data;
    private String[] subjects = {"math", "english", "software"};
    // implement by yourself
    private Statistic statistic;

    // implement by yourself for public void setStatistic(Statistic stat)...
    public void setStatistic(Statistic stat) {
        this.statistic = stat;
    }

    // implement by yourself for public double calcStatistic(String subject)...
    public double calcStatistic(String subject) {
        return statistic.calc(data.get(subject));
    }

    public void readFromCSV(String fileName) {
        data = new HashMap<String, ArrayList<Integer>>();
        for (String subj : subjects)
            data.put(subj, new ArrayList<Integer>());
        try {
            File file = new File(fileName);
            FileReader reader = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(reader);
            String str;
            while((str = bufferReader.readLine()) != null) {
                addScores(str.split(","));
            }
        } catch (FileNotFoundException e) {
            System.err.println("file " + fileName + " not found");
        } catch (IOException e) { e.printStackTrace(); }
    }

    private void addScores(String[] scores) {
        int index = 0;
        for (String subj : subjects) {
            ArrayList list = data.get(subj);
            list.add(Integer.parseInt(scores[index++]));
        }
    }
}