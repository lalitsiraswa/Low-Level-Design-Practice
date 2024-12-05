package design_patterns.creational_patterns.abstract_factory_by_ashish;

public class FlatSole implements Sole {
    @Override
    public String soleBuild() {
        return "Flat";
    }

    @Override
    public String soleMaterial() {
        return "Synthetic Rubber";
    }
}
