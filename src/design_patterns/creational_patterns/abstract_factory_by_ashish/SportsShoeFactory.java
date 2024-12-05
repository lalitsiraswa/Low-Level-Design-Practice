package design_patterns.creational_patterns.abstract_factory_by_ashish;

public class SportsShoeFactory implements ShoeFactory {
    @Override
    public Sole createChoeSole() {
        return new BumpySole();
    }

    @Override
    public ShoeLace createShoeLace() {
        return new RoundShoeLace();
    }
}
