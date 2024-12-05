package design_patterns.creational_patterns.abstract_factory_by_ashish;

public class TapeShoeLace implements ShoeLace {
    @Override
    public String shoeLaceBuild() {
        return "Tape Flat";
    }

    @Override
    public String shoeLaceMaterial() {
        return "Synthetic Cotton";
    }
}
