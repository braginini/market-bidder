package ru.mbragin.marketbidder.controller.request;

/**
 * @author: mbragin
 */
public interface IRequest {

    /**
     * Used to validate client request and throw exception if validation fails
     */
    void validate() throws Exception;
}
