import Classes.ActionClient;
import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PensionerClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviuor;
import Interfaces.iReturnOrder;

public class App {
    public static void main(String[] args) throws Exception {
        
        Market magnit = new Market();
        //iActorBehaviuor client1 = new OrdinaryClient("Boris");
        //iActorBehaviuor client2 = new SpecialClient("prezident",1001);
        //iActorBehaviuor p = new PensionerClient("Sergey Nikolay",1111);
        //iActorBehaviuor tax = new TaxService();
        //iActorBehaviuor actionClient1 = new ActionClient("Julia", "Discount50", 001, 2);
        //iActorBehaviuor actionClient2 = new ActionClient("Irina", "Discount50", 002, 2);
        //iActorBehaviuor actionClient3 = new ActionClient("Eva", "Discount50", 003, 2);

        //magnit.acceptToMarket(client1);
        //magnit.acceptToMarket(client2);
        //magnit.acceptToMarket(p);
        //magnit.acceptToMarket(tax);
        //magnit.acceptToMarket(actionClient1);
        //magnit.acceptToMarket(actionClient2);
        //magnit.acceptToMarket(actionClient3);

        

        magnit.update();
    }
}