package com.wsoft.printingservice.exeptions;

/**
 *
 * @author b.walid
 */
public class JsonMalFormedException extends RuntimeException {

    public JsonMalFormedException(String exception) {
        super(exception);
    }
}
