package com.gl.javafsd.dsa.denominations;
import java.util.List;

public class Result {
	private boolean exactPaymentAchievedOrNot;
	private List<DenominationInstancesPair>denominationinstancesList;
	public boolean isExactPaymentAchievedOrNot() {
		return exactPaymentAchievedOrNot;
	}
	public void setExactPaymentAchievedOrNot(boolean exactPaymentAchievedOrNot) {
		this.exactPaymentAchievedOrNot = exactPaymentAchievedOrNot;
	}
	public List<DenominationInstancesPair> getDenominationinstancesList() {
		return denominationinstancesList;
	}
	public void setDenominationinstancesList(List<DenominationInstancesPair> denominationinstancesList) {
		this.denominationinstancesList = denominationinstancesList;
	}
	
}
