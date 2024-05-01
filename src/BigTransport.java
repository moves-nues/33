public abstract class BigTransport extends General {


    public BigTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public abstract void service();

    @Override
    public void check() {
        super.check();

        checkEngine();

    }public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
