package Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Maping<K, V> {
    Map<String, ArrayList<String>> map;
    private int size = 0;

    public Map<String, ArrayList<String>> createMap() {
        map = new HashMap<>();
        addValue("Голубев", "Андрей");
        addValue("Голубев", "Борис");
        addValue("Корсунов", "Вадим");
        addValue("Корсунов", "Вадим");
        addValue("Лойко", "Дмитрий");
        addValue("Муратов", "Дмитрий");
        addValue("Николенко", "Елисей");
        addValue("Орешников", "Женя");
        addValue("Корсунов", "Зина");
        addValue("Петухов", "Ваня");
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
        size++;
    }

    public int getSize() {
        return size;
    }

    public int getSameFirstNameCount() {
        int amount = 0;
        ArrayList<Object> list = new ArrayList<>(getSize());
        for (int j = 0; j < map.size(); j++) {
            ArrayList<Object> buff = (ArrayList<Object>) map.values().toArray()[j];
            list.addAll(buff);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).toString().charAt(0) > list.get(j).toString().charAt(0)) {
                    Object object = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, object);
                }
            }
        }
        boolean buff = false;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    amount++;
                    buff = true;
                } else if (buff) {
                    buff = false;
                    i = j;
                    amount++;
                }
            }
        }
        return amount;
    }

    public int getSameLastNameCount() {
        int amount = 0;
        for (int i = 0; i < map.size(); i++) {
            ArrayList<Object> buff = (ArrayList<Object>) map.values().toArray()[i];
            if (buff.size() > 1) {
                amount += buff.size();
            }
        }
        return amount;
    }
}
