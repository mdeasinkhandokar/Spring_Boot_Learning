package IoC_Container_DI.IoC_Container_DI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    @Autowired
    public Computer(Keyboard keyboard){
        System.out.println("object of Computer created");
        this.keyboard= keyboard;
    }

    Keyboard keyboard ;



    public void start(){
        System.out.println("Starting the computer .");
        keyboard.plugIn();
    }


//@Autowired
//    public void setKeyboard(Keyboard keyboard) {
//        this.keyboard = keyboard;
//    }
}
