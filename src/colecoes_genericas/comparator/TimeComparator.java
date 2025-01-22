package colecoes_genericas.comparator;

import java.util.Comparator;

// Figura 16.8: TimeComparator.java
// Classe Comparator personalizada que compara dois objetos Time2.
public class TimeComparator implements Comparator<Time2> {

    @Override
    public int compare(Time2 time1, Time2 time2) {
        int hourDifference = time1.getHour() - time2.getHour();

        if(hourDifference != 0){
            return hourDifference;
        }

        int minuteDifference = time1.getMinute() - time2.getMinute();

        if (minuteDifference != 0){
            return minuteDifference;
        }

        return time1.getSecond() - time2.getSecond();
    }
}
