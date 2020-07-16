package strategy.java;

public class Camera {
    String model;
    String brand;
    ISnapshotBehavior snapshotBehavior;

    public Camera (String model, String brand, ISnapshotBehavior snapshotBehavior) {
        this.model = model;
        this.brand = brand;
        this.snapshotBehavior = snapshotBehavior;
    }

    public String snapshot() {
        return snapshotBehavior.snapshot();
    }
}