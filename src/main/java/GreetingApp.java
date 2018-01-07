import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 전소연 on 11/2/2017.
 */
public class GreetingApp {
    // this tag tell the spring to use these properties in the class, used when we link classes or objects
    @Autowired
    private GoodByeManager goodByeManager;
    @Autowired
    private HelloManager helloManager;

    public void meeting() {
        helloManager.greet();
        goodByeManager.greet();
    }

    public GoodByeManager getGoodByeManager() {
        return goodByeManager;
    }

    public void setGoodByeManager(GoodByeManager goodByeManager) {
        this.goodByeManager = goodByeManager;
    }

    public HelloManager getHelloManager() {
        return helloManager;
    }

    public void setHelloManager(HelloManager helloManager) {
        this.helloManager = helloManager;
    }
}
