package IoC_Container_DI.IoC_Container_DI;

import org.springframework.stereotype.Component;

@Component
public class Keyboard {
    public Keyboard(){
        System.out.println("Keyboard class object created");
    }
    public void plugIn(){
        System.out.println("plugging in keyboard");
    }
}
