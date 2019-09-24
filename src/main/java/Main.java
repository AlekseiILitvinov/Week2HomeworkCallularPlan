public class Main {
    public static void main(String[] args) {
        PaymentPlan classic = new PaymentPlan("Классический", true);
        PaymentPlan internetForDevices = new PaymentPlan("Интернет для устройств", false);
        PaymentPlan internetOfThings = new PaymentPlan("Интернет для вещей", 100, "Месяц", 300, "МБ",
                false, false, 30,false, 100, false);
        PaymentPlan myOnlinePlus = new PaymentPlan("Мой онлайн +", 350, "Месяц", 20, "ГБ", true, true, 600,
                true,0 ,false );
        PaymentPlan unlimited = new PaymentPlan("Безлимит", 400, "Месяц", true, 500, true, 50, false);
        PaymentPlan myTele2 = new PaymentPlan("Мой Tele2", 7, "День", 6, "ГБ", false, false, 0, true, 0, true);
    }
}
