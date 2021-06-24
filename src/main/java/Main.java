import abstractFactory.FurnitureFactory;
import abstractFactory.FurnitureFactoryModern;
import abstractFactory.FurnitureFactoryVictorian;
import fatoryMethod.Logistics;
import fatoryMethod.RoadLogistic;
import fatoryMethod.SeaLogistic;
import fatoryMethod.Transport;

public class Main {

    public static void main(String[] args) {
        //фабричный метод
        doDeliver(new RoadLogistic());
        doDeliver(new SeaLogistic());

        //абстрактная фабрика
        createSofa(new FurnitureFactoryModern());
        createChair(new FurnitureFactoryVictorian());
    }

    private static void createSofa(FurnitureFactoryModern furnitureFactoryModern) {
        
    }

    //фабричный метод
    static void doDeliver(Logistics logistics) {
        logistics.createTransport().deliver();
    }
}
