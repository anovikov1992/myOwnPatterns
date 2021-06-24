package abstractFactory;

public class FurnitureFactoryVictorian implements FurnitureFactory{
    @Override
    public Chair createChair() {
        System.out.println("Create victorian chair");
        return new ChairVictorian();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Create victorian sofa");
        return new SofaVictorian();
    }
}
