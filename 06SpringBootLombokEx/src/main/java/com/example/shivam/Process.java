package com.example.shivam;

import io.micrometer.common.lang.NonNull;
import lombok.Data;

@Data
public class Process {

	@NonNull
	private String code;
	@NonNull
	private int port;
	private boolean exist;

}
