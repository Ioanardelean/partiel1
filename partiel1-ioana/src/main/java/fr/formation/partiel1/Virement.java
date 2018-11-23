package fr.formation.partiel1;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author Ioana
 */
public class Virement {

    private LocalDateTime dateP;

    private LocalDateTime dateS;

    private double amount;

    public Virement(double amount, LocalDateTime dateP, LocalDateTime dateS) {
	setDateP(dateP);
	setDateS(dateS);
	setAmount(amount);
    }

    public LocalDateTime getDateP() {
	return dateP;
    }

    public LocalDateTime getDateS() {
	return dateS;
    }

    public double getAmount() {
	return amount;
    }

    private void setDateP(LocalDateTime dateP) {
	Objects.requireNonNull(dateP);
	this.dateP = dateP;
    }

    private void setDateS(LocalDateTime dateS) {
	Objects.requireNonNull(dateS);
	this.dateS = dateS;
    }

    private void setAmount(double amount) {
	if (amount <= 0)
	    throw new IllegalArgumentException();
	this.amount = amount;
    }
}
