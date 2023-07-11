// Интерфейс возврата товара. Продумать какие методы могут понадобиться и подключить интерфейс к классам клиентов.

package Interfaces;

public interface iReturnOrder {
     /** Метод возврата товара*/
    public void returnOrder();
     /** Метод причина возврата товара*/
    public void getReasonForReturn();
}
