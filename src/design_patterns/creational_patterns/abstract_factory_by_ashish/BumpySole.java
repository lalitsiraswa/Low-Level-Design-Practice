package design_patterns.creational_patterns.abstract_factory_by_ashish;

public class BumpySole implements Sole {
    @Override
    public String soleBuild() {
        return "Bumpy";
    }

    @Override
    public String soleMaterial() {
        return "Plastic Rubber";
    }
}
