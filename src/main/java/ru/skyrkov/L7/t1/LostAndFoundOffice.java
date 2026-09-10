package ru.skyrkov.L7.t1;

import java.util.ArrayList;

public class LostAndFoundOffice {
    ArrayList<Object> things = new ArrayList<>();

    public void put(Object obj) {
        things.add(obj);
    }

    public boolean check(Object target) {
//        return things.contains(object);
        for (Object object : things) { // логика проверки вещи в списке
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}