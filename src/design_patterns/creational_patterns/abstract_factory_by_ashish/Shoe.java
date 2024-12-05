package design_patterns.creational_patterns.abstract_factory_by_ashish;

public class Shoe {
    private Sole sole;
    private ShoeLace shoeLace;

    public Shoe(Sole sole, ShoeLace shoeLace) {
        this.sole = sole;
        this.shoeLace = shoeLace;
    }

    public void displayBuildShoe() {
        System.out.println("Sole Type Is : " + this.sole.soleBuild());
        System.out.println("Sole Material Is : " + this.sole.soleMaterial());
        System.out.println("ShoeLace Type Is : " + this.shoeLace.shoeLaceBuild());
        System.out.println("ShoeLace Material Is : " + this.shoeLace.shoeLaceMaterial());
    }
}
