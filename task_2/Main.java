package task_2;

public class Main {
    public static void main(String[] args) {
        ImmutableList immutableList = new ImmutableList();
        immutableList.spisok();
        immutableList.getInt(4);
        immutableList.getSize();
        System.out.println();
        MutableList<Double> mutableList = new MutableList<>();
        mutableList.addInList(6.2);
        mutableList.addInList(4.1);
        mutableList.addInList(8.4);
        mutableList.addInList(0.9);
        mutableList.addInList(5.0);
        mutableList.addInList(6.6);
        mutableList.spisok();
        mutableList.getInt(4);
        mutableList.removeInList(8.4);
        mutableList.getSize();
        System.out.println();
        mutableList.spisok();
    }
}
