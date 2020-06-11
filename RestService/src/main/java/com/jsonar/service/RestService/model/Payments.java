/**
 * 
 */
package com.jsonar.service.RestService.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.jsonar.service.RestService.PaymentConstants;

/**
 * @author naveenraj.devaraj
 *
 */
@Document(value=PaymentConstants.DOCUMENT_ID)
public class Payments {
    @Field(PaymentConstants.PAYMENT_ID)
    int paymentId;
    @Field(PaymentConstants.AMOUNT)
    float amount;
    @Field(PaymentConstants.PAYMENT_DATE)
    String paymentDate;
    /**
     * @return the paymentId
     */
    public int getPaymentId() {
        return paymentId;
    }
    /**
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }
    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }
    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }
    /**
     * @return the paymentDate
     */
    public String getPaymentDate() {
        return paymentDate;
    }
    /**
     * @param paymentDate the paymentDate to set
     */
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

}
