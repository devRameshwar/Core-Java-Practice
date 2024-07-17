package com.exception;

public class CustomException {

    public static void checkNumber(Integer integer){
        if(integer<0){
            throw new NumberCheckException("Negative number is not allow..");
        }else {
            System.out.println("Positive number...");
        }
    }

    public static void main(String[] args) {
        try{
        	checkNumber(-9);
        }catch (NumberCheckException e) {
			e.printStackTrace();
        	System.out.println(e.getMessage());
		}
    }
}

class NumberCheckException extends RuntimeException{
    private final Integer serialNumber=123456_12;
    private String message;

    public NumberCheckException( String message) {
        System.out.println("NumberCheckException object is created... ");
        this.message = message;
        System.out.println(message);
    }
}
