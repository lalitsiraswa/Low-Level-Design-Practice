package design_patterns.creational_patterns.abstract_factory_by_ashish;

public class ThinSole implements Sole {
    @Override
    public String soleBuild() {
        return "Thin Plated";
    }

    @Override
    public String soleMaterial() {
        return "Rubber";
    }
}
