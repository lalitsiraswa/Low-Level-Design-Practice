package design_patterns.creational_patterns.abstract_factory_by_ashish;

public class CasualShoeFactory implements ShoeFactory {
    @Override
    public Sole createChoeSole() {
        return new ThinSole();
    }

    @Override
    public ShoeLace createShoeLace() {
        return new TapeShoeLace();
    }
}
