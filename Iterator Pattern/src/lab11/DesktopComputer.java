package lab11;

public abstract class DesktopComputer {

    final void buildComputer() {
        plugCPU();
        plugMemory();
        plugStorage();
        plugPeripherals();
    }

    abstract void plugCPU();
    abstract void plugMemory();
    abstract void plugStorage();

    void plugPeripherals() {
        System.out.println("Connecting mouse, keyboard, monitor");
    }

}
