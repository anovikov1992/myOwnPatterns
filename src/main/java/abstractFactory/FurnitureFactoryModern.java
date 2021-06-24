package abstractFactory;

public class FurnitureFactoryModern implements FurnitureFactory{

    @Override
    public Chair createChair() {
        System.out.println("Create modern chair");
        return new ChairModern();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Create modern sofa");
        return new SofaModern();
    }
}
