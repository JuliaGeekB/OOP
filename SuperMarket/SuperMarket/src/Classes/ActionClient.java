package Classes;

public class ActionClient extends Actor{
       
    /** Поле название акции */
    private String nameOfAction;
    /** Поле id клиента */
    private int idAction;
    /** Поле количество участников акции акции */
    private static int numberOfMembersAction;

    /** Конструктор*/
    public ActionClient (String name, String nameOfAction, int idAction, int numberOfMembersAction) {
        super(name+" - участник акции");
        this.nameOfAction = nameOfAction;
        this.idAction = idAction;
        ActionClient.numberOfMembersAction = numberOfMembersAction;
    }
    
    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
      return this;
    }
    


}
