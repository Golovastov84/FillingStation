public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчёта стоимости топлива");
        int fuelType = 92;
        int amount = 50;
        double fuel92price = 60.2;
        double fuel95price = 67.33;
        double fuelPrice = 0;
        if(fuelType == 92) {
            fuelPrice = fuel92price;
        }
        else if(fuelType == 95) {
            fuelPrice = fuel95price;
        }
        else {
            System.out.println("У нас в продаже нет бензина с таким октановым числом.");
        }
        if(amount < 1) {
            System.out.println("Указано слишком малое количество топлива");
            amount = 0;
        }
        System.out.println("Цена выбранного топлива: " + fuelPrice + " руб.");
        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
    }
}