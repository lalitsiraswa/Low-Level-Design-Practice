package design_patterns.creational_patterns.abstract_factory_by_ashish;

public class RoundShoeLace implements ShoeLace{
    @Override
    public String shoeLaceBuild() {
        return "Round";
    }

    @Override
    public String shoeLaceMaterial() {
        return "Synthetic Polyester";
    }
}
