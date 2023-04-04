package com.gl.javafsd.dsa.denominations;

public class DenominationInstancesPair {
	private int denominationValue;
	private int noOfInstances;
	public void DenominationInstancesPair(int denominationValue,int noOfInstances) {
		this.denominationValue = denominationValue;
		this.noOfInstances = noOfInstances ;
	}
	
	public int getDenominationvalue() {
		return denominationValue;
	}
	public void setDenominationvalue(int denominationvalue) {
		this.denominationValue = denominationvalue;
	}
	public int getNoofinstances() {
		return noOfInstances;
	}
	public void setNoofinstances(int noofinstances) {
		this.noOfInstances = noofinstances;
	}
	
	

}
