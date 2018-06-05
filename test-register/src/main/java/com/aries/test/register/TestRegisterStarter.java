package com.aries.test.register;

import com.aries.register.annotations.AriesRpcDiscovery;
import com.aries.register.boot.RegisterServerBoot;

@AriesRpcDiscovery(port = 9999)
public class TestRegisterStarter {
    public static void main(String[] args) {
        RegisterServerBoot.run(TestRegisterStarter.class);
    }
}
