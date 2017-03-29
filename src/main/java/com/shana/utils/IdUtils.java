package com.shana.utils;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class IdUtils {
	
   public String genarateId(String className)
   {
	   return UUID.randomUUID().toString();
   }
}
