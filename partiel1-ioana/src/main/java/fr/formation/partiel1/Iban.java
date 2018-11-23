package fr.formation.partiel1;

import java.util.Objects;

public class Iban {

    private String codeP;

    private int keyC;

    private int keyB;

    private int keyG;

    private String numberAcount;

    private int keyR;

    public Iban(String codeP, int keyC, int keyB, int keyG, String numberAcount,
	    int keyR) {
	setCodeP(codeP);
	setKeyC(keyC);
	setKeyB(keyB);
	setKeyG(keyG);
	setNumberAcount(numberAcount);
	setKeyR(keyR);
    }

    public String getCodeP() {
	return codeP;
    }

    public int getKeyC() {
	return keyC;
    }

    public int getKeyB() {
	return keyB;
    }

    public int getKeyG() {
	return keyG;
    }

    public String numberAcount() {
	return numberAcount;
    }

    public int getKeyR() {
	return keyR;
    }

    private void setCodeP(String codeP) {
	Objects.requireNonNull(codeP);
	this.codeP = codeP;
    }

    private void setKeyC(int keyC) {
	if (keyC <= 0)
	    throw new IllegalArgumentException();
	this.keyC = keyC;
    }

    private void setKeyB(int keyB) {
	if (keyB <= 0)
	    throw new IllegalArgumentException();
	this.keyB = keyB;
    }

    private void setKeyG(int keyG) {
	if (keyG <= 0)
	    throw new IllegalArgumentException();
	this.keyG = keyG;
    }

    private void setNumberAcount(String numberAcount) {
	Objects.requireNonNull(numberAcount);
	this.numberAcount = numberAcount;
    }

    private void setKeyR(int keyR) {
	if (keyR <= 0)
	    throw new IllegalArgumentException();
	this.keyR = keyR;
    }
}
