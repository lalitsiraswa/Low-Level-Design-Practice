package design_patterns.creational_patterns.abstract_factory_by_ashish;

public class ShoeManufacture {
    static ShoeFactory shoeFactory;

    public static Shoe produceShoe(String shoeType) {
        shoeType = shoeType.trim().toLowerCase();
        if (shoeType.equals("formal")) {
            shoeFactory = new FormalShoeFactory();
        }
        if (shoeType.equals("sports")) {
            shoeFactory = new SportsShoeFactory();
        }
        if (shoeType.equals("casual")) {
            shoeFactory = new SportsShoeFactory();
        }
        return new Shoe(shoeFactory.createChoeSole(), shoeFactory.createShoeLace());
    }

    public static void main(String[] args) {
        Shoe formalShoe = produceShoe("formal");
        Shoe sportsShoe = produceShoe("sports");
        Shoe casualShoe = produceShoe("casual");

        formalShoe.displayBuildShoe();
        sportsShoe.displayBuildShoe();
        casualShoe.displayBuildShoe();
    }
}
