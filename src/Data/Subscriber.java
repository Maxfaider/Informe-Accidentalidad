
package Data;

/**
 *
 * @author Alan M.E
 */
public class Subscriber {
    
    private static Subscriber subscriber;
    private Logger logger;
    
    private Subscriber() {
        
    }
    
    public static Subscriber toSubscribe() {
        if (subscriber == null) 
            return subscriber = new Subscriber();
        return subscriber;
    }
    
    public void setSubscriber(Logger logger) {
        this.logger = logger;
    }
    
    public void setLog(String message) {
        logger.setMessage(message);
    }
    
}
