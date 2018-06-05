package com.aries.test.rpcservice;

import com.aries.disserver.annotations.EnableDiscovery;
import com.aries.server.AriesRpcFrameWork;
import com.aries.server.annotation.BasePackage;
import com.aries.server.annotation.RpcServerStart;

@RpcServerStart(value = "TEST-CUSTOMER", port = 6666, configLocation = "/test-rpcservice/src/main/resources/")
@BasePackage("com.aries.test.rpcservice")
@EnableDiscovery(value = "127.0.0.1", port = 9999)
public class TestRpcServiceStarter {
    public static void main(String[] args) {
        AriesRpcFrameWork.run(TestRpcServiceStarter.class);
    }
}
