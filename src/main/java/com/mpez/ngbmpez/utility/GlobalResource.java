package com.mpez.ngbmpez.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class GlobalResource {

    public static Logger getLogger(Class aClass){
        return LoggerFactory.getLogger(aClass);
    }

}
