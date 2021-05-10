package com.teng.service;

import com.teng.dao.HelloDao;

public class HelloService {
    private String name;
    private HelloDao helloDao;
    public HelloService(String name){
        this.name = name;
    }

    public HelloDao getHelloDao() {
        return helloDao;
    }

    public void setHelloDao(HelloDao helloDao) {
        this.helloDao = helloDao;
    }
    public void sayHello(){
        System.out.println("Hello, "+this.name);
        helloDao.insert();
    }
}
