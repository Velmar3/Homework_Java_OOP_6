package task_2;

import java.util.ArrayList;

public class ImmutableList<T> extends AbstractList<Integer> {

    public ImmutableList() {
        this.spisok = new ArrayList<>();
        spisok.add(7);
        spisok.add(1);
        spisok.add(0);
        spisok.add(2);
        spisok.add(9);
        spisok.add(3);
    }

    @Override
    public void spisok() {
        System.out.println(spisok);
    }

    @Override
    public void getInt(int i) {
        System.out.println(spisok.get(i));
    }

    @Override
    public void getSize() {
        System.out.println(spisok.size());
    }
}
