package design_patterns.creational_patterns.abstract_factory_by_ashish;

public class FormalShoeFactory implements ShoeFactory {
    @Override
    public Sole createChoeSole() {
        return new FlatSole();
    }

    @Override
    public ShoeLace createShoeLace() {
        return new RoundShoeLace();
    }
}
