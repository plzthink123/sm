package com.think123.sm.service;

import com.think123.sm.entity.Staff;

public interface SelfService {
    Staff login(String account, String password);
    void changePassword(Integer id, String password);
}
