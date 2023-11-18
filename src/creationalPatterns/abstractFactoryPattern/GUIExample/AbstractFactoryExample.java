package creationalPatterns.abstractFactoryPattern.GUIExample;

// AbstractProductButton interface
interface Button {
    void click();
}

// ConcreteProductButton - WindowsButton
class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows button clicked");
    }
}

// ConcreteProductButton - MacOSButton
class MacOSButton implements Button {
    @Override
    public void click() {
        System.out.println("MacOS button clicked");
    }
}

// AbstractProductCheckbox interface
interface Checkbox {
    void check();
}

// ConcreteProductCheckbox - WindowsCheckbox
class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Windows checkbox checked");
    }
}

// ConcreteProductCheckbox - MacOSCheckbox
class MacOSCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("MacOS checkbox checked");
    }
}

// AbstractFactory interface
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// ConcreteFactory for Windows
class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

// ConcreteFactory for MacOS
class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

// Client code using the Abstract Factory
public class AbstractFactoryExample {
    public static void main(String[] args) {
        // Create a Windows GUI
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        Checkbox windowsCheckbox = windowsFactory.createCheckbox();

        // Interact with Windows GUI components
        windowsButton.click();
        windowsCheckbox.check();

        // Create a MacOS GUI
        GUIFactory macFactory = new MacOSFactory();
        Button macButton = macFactory.createButton();
        Checkbox macCheckbox = macFactory.createCheckbox();

        // Interact with MacOS GUI components
        macButton.click();
        macCheckbox.check();
    }
}

