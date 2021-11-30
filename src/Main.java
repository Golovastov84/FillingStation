import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчёта стоимости топлива");
        int fuelType = 92; // Тип топлива
        var amount = 12; // Заказываемое количество топлива.
        // var тип переменоой определяется автоматисеки
        boolean hasDiscount = amount > 10; // Наличие скидки, если выполняется условие
        int maxAmount = 400; // Ограничение на единовременную покупку топлива
        double fuel92price = 60.2; // Цена 1л 92 бензина
        double fuel95price = 67.33; // Цена 1л 95 бензина
        double discount = 0.1; // Величина скидки в долях
        String wrongFuelTypeMessage = "Указан неверный тип топлива";
        String fuelPriceMessage;
        double fuelPrice = 0;
        if(fuelType == 92) {
            fuelPrice = fuel92price;
        }
        else if(fuelType == 95) {
            fuelPrice = fuel95price;
        }
        else {
            System.out.println(wrongFuelTypeMessage);
        }
        if(hasDiscount) {
            fuelPrice = (1 - discount) * fuelPrice;
            fuelPrice = (Math.ceil(fuelPrice * 100))/100;
        }
        if(amount < 1) {
            System.out.println("Указано слишком малое количество топлива");
            amount = 0;
        }
        if(amount > maxAmount) {
            System.out.println("Указанное количество топлива превышает максимально допустимое");
            System.out.println("Максимальное количество отпускаемого топлива за одну заправку составляет "
                    + maxAmount + " л.");
            amount =  maxAmount;
        }
        fuelPriceMessage = "Цена выбранного топлива: " + fuelPrice + " руб.";
        System.out.println(fuelPriceMessage);
        double totalPrice = fuelPrice * amount;
        totalPrice = (Math.ceil(totalPrice * 100))/100;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
    }
}
