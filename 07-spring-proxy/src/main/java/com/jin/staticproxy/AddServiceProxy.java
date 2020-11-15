package com.jin.staticproxy;

import com.jin.service.AddService;

public class AddServiceProxy implements AddService {

    private AddService addService;

    public AddServiceProxy(AddService addService) {
        this.addService = addService;
    }

    @Override
    public int add(int x, int y) {
        return x + y;
    }
}
