public class Main {
    public static void main(String[] args) {
        PaymentPlan classic = new PaymentPlan("Классический", true);
        PaymentPlan internetForDevices = new PaymentPlan("Интернет для устройств", false);
        PaymentPlan internetOfThings = new PaymentPlan("Интернет для вещей", 100, "Месяц", 300, "МБ", false, 30,
                false, 100, false);
        PaymentPlan myOnlinePlus = new PaymentPlan("Мой онлайн +", 350, "Месяц", 20,false , "ГБ", true, true, 600,
                true,0 ,false );
        PaymentPlan unlimited = new PaymentPlan("Безлимит", 400, "Месяц", 0, true, "", false, false, 500, true, 50, false);
    }
}
