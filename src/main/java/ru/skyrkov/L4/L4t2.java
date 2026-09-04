package ru.skyrkov.L4;

import java.util.ArrayList;
import java.util.HashMap;

public class L4t2 {
    static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();
        stateHolidays.put("january", new ArrayList<>());
        stateHolidays.get("january").add(1);
        stateHolidays.get("january").add(7);
        stateHolidays.put("february", new ArrayList<>());
        stateHolidays.get("february").add(23);
        stateHolidays.put("march", new ArrayList<>());
        stateHolidays.get("march").add(8);
        stateHolidays.put("may", new ArrayList<>());
        stateHolidays.get("may").add(1);
        stateHolidays.get("may").add(9);
        stateHolidays.put("june", new ArrayList<>());
        stateHolidays.get("june").add(12);
        stateHolidays.put("november", new ArrayList<>());
        stateHolidays.get("november").add(4);

        System.out.println(stateHolidays);
    }
}
