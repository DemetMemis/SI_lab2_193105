import java.util.ArrayList;
import java.util.List;

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public  static List<Integer> function(List<Time> timesList) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < timesList.size(); i++) {
            int hr = timesList.get(i).getHours();
            int min = timesList.get(i).getMinutes();
            int sec = timesList.get(i).getSeconds();
            if (hr < 0 || hr > 24){
                if (hr < 0){
                    throw new RuntimeException("The hours are smaller than the minimum");
                }
                else {
                    throw new RuntimeException("The hours are grater than the maximum");
                }
            }
            else if (hr < 24) {
                if (min < 0 || min > 59)
                    throw new RuntimeException("The minutes are not valid!");
                else {
                    if (sec >= 0 && sec <= 59)
                        result.add(hr * 3600 + min * 60 + sec);
                    else
                        throw new RuntimeException("The seconds are not valid");
                }
            }
            else if (hr == 24 && min == 0 && sec == 0) {
                result.add(hr * 3600 + min * 60 + sec);
            }
            else {
                throw new RuntimeException("The time is greater than the maximum");
            }
        }
        return result;
    }
}
