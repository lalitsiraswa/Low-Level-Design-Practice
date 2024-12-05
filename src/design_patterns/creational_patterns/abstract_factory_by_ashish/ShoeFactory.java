package design_patterns.creational_patterns.abstract_factory_by_ashish;

public interface ShoeFactory {
    Sole createChoeSole();

    ShoeLace createShoeLace();
}
