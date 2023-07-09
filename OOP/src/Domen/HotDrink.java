package Domen;

public class HotDrink extends Product {
    // Поля
    private int temperature;

    // Конструкторы
    public int getTemperature() {
        return temperature;
    }

    public HotDrink(int price, int place, String name, long id){
        super(price,place,name,id);
        this.temperature = 75;
    }

    public HotDrink (int price, int place, String name, long id, int temperature){
        super(price,place,name,id);
        this.temperature = temperature;
    }
    
    // Свойства
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\ntemperature="+temperature;
    }

}
