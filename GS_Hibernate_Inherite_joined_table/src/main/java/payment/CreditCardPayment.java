package payment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="jc_credit_payment")
@PrimaryKeyJoinColumn(name="PAYMENT_ID")
public class CreditCardPayment extends Payment {

    @Column(name="CARD_NUMBER")
    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
