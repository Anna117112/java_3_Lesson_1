package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Box <T> {
    private List<T> fruit;

    public Box(T... items) {
        this.fruit = new ArrayList<>(Arrays.asList(items));

    }
// узнаем вес коробки по количеству фруктов (вес одного фрукта задан изначально константой)
    public float getWeight() {
        float result = 0;
        if (fruit.size() > 0) {
            if (fruit.get(0) instanceof Apple) {
               // System.out.println(fruit.size() * Apple.WEIGHTAPPLE);
                result = fruit.size() * Apple.WEIGHTAPPLE;

            } else if (fruit.get(0) instanceof Orange) {
                //System.out.println(fruit.size() * Orange.WEIGHTORANGE);
                result = fruit.size() * Orange.WEIGHTORANGE;
            }

        }
return result;
    }

// савниваем коробки по их весу

    public boolean compare (Box<?> another){

        return Math.abs(this.getWeight()-another.getWeight())<0.0001;



    }
    // пересыпаем фрукты из одной коробки в другую
    public void shift (Box<T> box){
        box.fruit.addAll(this.fruit);
        this.fruit.clear();

    }
    // добавляем фрукты в коробку
    public void addBox(T...items1){
        Collections.addAll(this.fruit, items1);
    }
}

