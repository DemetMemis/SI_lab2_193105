import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SILab2Test {
    @Test
    void ConditionTest1() {
        Time time = new Time(-2, 5, 10);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The hours are smaller than the minimum");
        }
    }


    @Test
    void ConditionTest2() {
        Time time = new Time(28, 16, 28);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The hours are grater than the maximum");
        }
    }

    @Test
    void ConditionTest3() {
        Time time = new Time(14, -8, 24);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The minutes are not valid!");
        }
    }

    @Test
    void ConditionTest4() {
        Time time = new Time(15, 68, 15);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The minutes are not valid!");
        }
    }

    @Test
    void ConditionTest5() {
        Time time = new Time(20, 50, -10);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The seconds are not valid");
        }
    }

    @Test
    void ConditionTest6() {
        Time time = new Time(15, 20, 80);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The seconds are not valid");
        }
    }

    @Test
    void ConditonTest7() {
        Time time = new Time(15,12,10);
        List<Time> timesList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        timesList.add(time);
        result = SILab2.function(timesList);
        assertEquals(result.get(0).intValue(),time.getHours()*3600 + time.getMinutes()*60 + time.getSeconds());
    }

    @Test
    void ConditionTest9() {
        Time time = new Time(24, 10, 0);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The time is greater than the maximum");
        }
    }
    @Test
    void ConditonTest10() {
        Time time = new Time(24,0,0);
        List<Time> timesList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        timesList.add(time);
        result = SILab2.function(timesList);
        assertEquals(result.get(0).intValue(),time.getHours()*3600 + time.getMinutes()*60 + time.getSeconds());
    }

    @Test
    void ConditionTest11() {
        Time time = new Time(24, 0, 10);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The time is greater than the maximum");
        }
    }

}

