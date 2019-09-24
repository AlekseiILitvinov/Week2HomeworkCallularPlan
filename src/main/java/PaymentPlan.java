public class PaymentPlan {
    private String planName;
    private String noSubscriptionFee;
    private int subscriptionFee;
    private String paymentPeriod;
    private int prepaidWeb;
    private String prepaidWebUnits;
    private boolean unlimitedWebAll;
    private boolean unlimitedWebSocial;
    private boolean unlimitedWebAbroad;
    private int prepaidPhoneMinutes;
    private boolean unlimitedPhoneTele2;
    private int prepaidSMS;
    private boolean isAdjustable;

    public PaymentPlan(String name, boolean isAdjustable) {
        this.planName = name;
        this.noSubscriptionFee = "Без абоненской платы";
        this.isAdjustable = isAdjustable;
    }

    public PaymentPlan(String planName, int subscriptionFee, String paymentPeriod,
                       boolean unlimitedWebAll, int prepaidPhoneMinutes,
                       boolean unlimitedPhoneTele2, int prepaidSMS, boolean isAdjustable) {
        this.planName = planName;
        this.subscriptionFee = subscriptionFee;
        this.paymentPeriod = paymentPeriod;
        this.unlimitedWebAll = unlimitedWebAll;
        this.prepaidPhoneMinutes = prepaidPhoneMinutes;
        this.unlimitedPhoneTele2 = unlimitedPhoneTele2;
        this.prepaidSMS = prepaidSMS;
        this.isAdjustable = isAdjustable;
    }

    public PaymentPlan(String planName, int subscriptionFee, String paymentPeriod, int prepaidWeb,
                       String prepaidWebUnits, boolean unlimitedWebSocial, boolean unlimitedWebAbroad, int prepaidPhoneMinutes,
                       boolean unlimitedPhoneTele2, int prepaidSMS, boolean isAdjustable) {
        this.planName = planName;
        this.subscriptionFee = subscriptionFee;
        this.paymentPeriod = paymentPeriod;
        this.prepaidWeb = prepaidWeb;
        this.prepaidWebUnits = prepaidWebUnits;
        this.unlimitedWebSocial = unlimitedWebSocial;
        this.unlimitedWebAbroad = unlimitedWebAbroad;
        this.prepaidPhoneMinutes = prepaidPhoneMinutes;
        this.unlimitedPhoneTele2 = unlimitedPhoneTele2;
        this.prepaidSMS = prepaidSMS;
        this.isAdjustable = isAdjustable;
    }
}
