package strategy.java;

public class Test {
    public static void main(String[] args) {
        Camera nikonCamera = new Camera("D5600", "Nikon", new INikonSnapshotBehavior());
        System.out.println(nikonCamera.snapshot());
        Camera canonCamera = new Camera("EOS R", "Canon", new ICanonSnapshotBehavior());
        System.out.println(canonCamera.snapshot());
    }
}