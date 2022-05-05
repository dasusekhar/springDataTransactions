package com.example.rest.utils;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {
	private static Map<String,Double> paymentMap=new HashMap<>();
	static
	{
		paymentMap.put("acc1", 12000.0);
	}
public static boolean validateCreditLimit(String accNo,Double paidAmount) 
{
	if(paidAmount>paymentMap.get(accNo))
	{
		throw new InsuffientAmountException("insuffient balance .........!");
		
	}else
	{
		return true;
	}
}
}
