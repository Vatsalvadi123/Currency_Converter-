package com.as.samples.vo;

public class Request {

	@Override
	public String toString() {
		return "Request [amount=" + amount + ", source=" + source + ", target=" + target + "]";
	}
	Double amount;
	String source;
	String target;
	Double result;
	
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public Double getResult() {
		return result;
	}
	public void setResult(Double result) {
		this.result = result;
	}
	
}
