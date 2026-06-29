package s129practicalno2;

class FoodOrder {
    void delivery() {
        System.out.println("Food delivery service");
    }
}

class Swiggy extends FoodOrder {
    @Override
    void delivery() {
        System.out.println("Order delivered by Swiggy");
    }
}

class Zomato extends FoodOrder {
    @Override
    void delivery() {
        System.out.println("Order delivered by Zomato");
    }
}

public class S129practicalno2 {
    public static void main(String[] args) {
        FoodOrder f1 = new Swiggy();
        f1.delivery();

        FoodOrder f2 = new Zomato();
        f2.delivery();
    }
}