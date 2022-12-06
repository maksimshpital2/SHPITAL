package Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Maping<K, V> {
    Map<String, ArrayList<String>> map;

    public Map<String, ArrayList<String>> createMap() {
        map = new HashMap<>();
        addValue("Соколов", "Егор");
        addValue("Петров", "Михаил");
        addValue("Сеницин", "Георгий");
        addValue("Воробьёв", "Егор");
        addValue("Зайцев", "Георгий");
        addValue("Сеницин", "Георгий");
        addValue("Мудко", "Азамат");
        addValue("Путин", "Семён");
        addValue("Горбунько", "Сергей");
        addValue("Николаенко", "Михаил");
        return map;
    }

    private void addValue(String key, String value) {
        ArrayList<String> list;
        if (map.containsKey(key)) {
            list = map.get(key);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(value);
        } else {
            list = new ArrayList<>();
            list.add(value);
        }
        map.put(key, list);
    }

    public int getSameFirstNameCount() {
        int amount = 0;
        for (int i = 0; i < map.values().toArray().length; i++) {
            for (int j = i + 1; j < map.values().toArray().length; j++) {
                ArrayList<Object> list1 = (ArrayList<Object>) map.values().toArray()[i];
                ArrayList<Object> list2 = (ArrayList<Object>) map.values().toArray()[j];
                if (list1.size() == 1 & list2.size() == 1) {
                    if (map.values().toArray()[i].equals(map.values().toArray()[j])) {
                        amount += 2;
                    }
                } else {
                    for (int k = 0; k < list1.size(); k++) {
                        for (int z = k + 1; z < list2.size(); z++) {
                            if (list1.get(k).equals(list2.get(z))) {
                                amount += 2;
                            }
                        }
                    }
                }
            }
        }
        return amount;
    }
}
