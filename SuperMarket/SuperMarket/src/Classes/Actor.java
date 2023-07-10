package Classes;

import Interfaces.iActorBehaviuor;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviuor, iReturnOrder {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    abstract public String getName();

    
}