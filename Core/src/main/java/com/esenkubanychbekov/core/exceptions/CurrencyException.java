package com.esenkubanychbekov.core.exceptions;

public class CurrencyNotExistException extends Exception {

    public CurrencyNotExistException() {
    }

    public CurrencyNotExistException(String massage) {
        super(massage);
    }

    public CurrencyNotExistException(String massage, Throwable cause) {
        super(massage, cause);
    }

    public CurrencyNotExistException(Throwable cause) {
        super(cause);
    }

    public CurrencyNotExistException(String massage, Throwable cause, boolean enableSupperssion, boolean writableStackTrace) {
        super(massage, cause, enableSupperssion, writableStackTrace);
    }
}
