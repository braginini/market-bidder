package ru.mbragin.marketbidder.controller.controller;

/**
 * @author: mbragin
 */
public interface IController {

    /**
     * Method should be invoked right after initialization (e.g. {@link javax.annotation.PostConstruct}
     */
    void init();

    /**
     * Method should be invoked right after destruction (e.g. {@link javax.annotation.PreDestroy}
     */
    void destroy();
}
