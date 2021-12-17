package com.library.hw18q4.service;

import com.library.hw18q4.core.BaseService;

public class ServiceFactory {
    public BaseService getTBaseService(BaseService.Type type){
        return switch(type){
            case AUTHOR -> new AuthorService();
            case BOOK -> new BookService();
        };
    }
}
