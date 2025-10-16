package PaPlats.Sprint2.ÖvnUppg8;

import java.util.List;

public class CalculationUtil {

    public static double getHighestVal(List<Double> list){
        double max = -Double.MAX_VALUE;
        for (Double d : list){
            if (d > max){
                max = d;
            }
        }
        return max;
    }

    public static double getLowestVal(List<Double> list){
        double min = Double.MAX_VALUE;
        for (Double d : list){
            if (d < min){
                min = d;
            }
        }
        return min;
    }

    public static double getAverageVal(List<Double> list){
        double sum = 0;
        for (Double d : list){
           sum += d;
        }
        return sum/list.size();
    }


}
