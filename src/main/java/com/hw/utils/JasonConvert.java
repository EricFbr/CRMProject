package com.hw.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JasonConvert {
	public static String convert(Object object) throws JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		String value = mapper.writeValueAsString(object);
		return "["+value+"]";
		
	}
}
