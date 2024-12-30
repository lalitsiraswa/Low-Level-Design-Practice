package solid_principles.dependency_inversion_principle.problem;

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
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public MacBook() {
        this.keyboard = new WiredKeyboard();
        this.mouse = new WiredMouse();
    }
}

class BluetoothMouse implements Mouse {
}

public class DependencyInversionPrincipleProblem {
}
