package task_1;

public class UnlokerSuper extends Unloker {
    @Override
    public void mode() {
        System.out.println("Без блокировки");
    }

    @Override
    public void pin() {
        System.out.println("Пин-код");
    }

    @Override
    public void fingerprint() {
        System.out.println("Отпечаток пальца");
    }

    @Override
    public void faceID() {
        System.out.println("Распознавание по лицу");
    }
}
