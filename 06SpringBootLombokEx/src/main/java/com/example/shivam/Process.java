package com.example.shivam;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Process {

	private int id;
	private String type;
	private String code;

}