package solid_principles.dependency_inversion_principle.solution;

// Class should depend on interfaces or abstract class rather than the concrete classes

interface Keyboard {
}

class WiredKeyboard implements Keyboard {
}

class BluetoothKeyboard implements Keyboard {
}

interface Mouse {
}

class WiredMouse implements Mouse {
}

class MacBook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    //    Constructor injection
    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}

class BluetoothMouse implements Mouse {
}

public class DependencyInversionPrincipleSolution {
}
