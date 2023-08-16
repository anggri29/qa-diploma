package ru.netology.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class PaymentPage {
    private SelenideElement heading = $$("h2").find(Condition.text("Путешествие дня"));
    private SelenideElement paymentButton = $$("button").find(exactText("Купить"));
    private SelenideElement creditButton = $$("button").find(exactText("Купить в кредит"));

    public PaymentPage() {
        heading.shouldBe(visible);
    }

    public PaymentGate clickPaymentPage() {
        paymentButton.click();
        return new PaymentGate();
    }

    public CreditGate clickCreditPage() {
        creditButton.click();
        return new CreditGate();
    }
}
