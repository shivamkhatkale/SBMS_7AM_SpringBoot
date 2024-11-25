package com.example.shivam;

public class Process {

	private int code;
	private String prefix;

	public Process() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	@Override
	public String toString() {
		return "Process [code=" + code + ", prefix=" + prefix + "]";
	}

}
