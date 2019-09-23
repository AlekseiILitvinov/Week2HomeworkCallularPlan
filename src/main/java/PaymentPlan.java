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
    private int prepaidPhonedMinutes;
    private boolean unlimitedPhoneTele2;
    private int prepaidSMS;
    private boolean isAdjustable;

    public PaymentPlan(String name, boolean isAdjustable) {
        this.planName = name;
        this.noSubscriptionFee = "Без абоненской платы";
        this.isAdjustable = isAdjustable;
    }

    public PaymentPlan(String planName, int subscriptionFee, String paymentPeriod, int prepaidWeb,
                       boolean unlimitedWebAll, String prepaidWebUnits, boolean unlimitedWebSocial,
                       boolean unlimitedWebAbroad, int prepaidPhonedMinutes, boolean unlimitedPhoneTele2,
                       int prepaidSMS, boolean isAdjustable) {
        this.planName = planName;
        this.subscriptionFee = subscriptionFee;
        this.paymentPeriod = paymentPeriod;
        this.prepaidWeb = prepaidWeb;
        this.prepaidWebUnits = prepaidWebUnits;
        this.unlimitedWebAll = unlimitedWebAll;
        this.unlimitedWebSocial = unlimitedWebSocial;
        this.unlimitedWebAbroad = unlimitedWebAbroad;
        this.prepaidPhonedMinutes = prepaidPhonedMinutes;
        this.unlimitedPhoneTele2 = unlimitedPhoneTele2;
        this.prepaidSMS = prepaidSMS;
        this.isAdjustable = isAdjustable;
    }

    public PaymentPlan(String planName, int subscriptionFee, String paymentPeriod, int prepaidWeb,
                       String prepaidWebUnits, boolean unlimitedWebSocial, int prepaidPhonedMinutes,
                       boolean unlimitedPhoneTele2, int prepaidSMS, boolean isAdjustable) {
        this.planName = planName;
        this.subscriptionFee = subscriptionFee;
        this.paymentPeriod = paymentPeriod;
        this.prepaidWeb = prepaidWeb;
        this.prepaidWebUnits = prepaidWebUnits;
        this.unlimitedWebSocial = unlimitedWebSocial;
        this.prepaidPhonedMinutes = prepaidPhonedMinutes;
        this.unlimitedPhoneTele2 = unlimitedPhoneTele2;
        this.prepaidSMS = prepaidSMS;
        this.isAdjustable = isAdjustable;
    }
}
