package org.skyshop;

import org.skyshop.Repository.AccountUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class mian {
    @Autowired
    private static AccountUserRepository accountUserRepository;
    public static void main(String[] args) {
        System.out.println(accountUserRepository.findById(1));
    }
}
