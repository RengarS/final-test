package com.aries.test.rpcservice.service;

import com.aries.server.annotation.AutoWired;
import com.aries.server.annotation.RpcService;
import com.aries.server.annotation.ServiceId;
import com.aries.test.domain.TestUser;
import com.aries.test.domain.UserDO;
import com.aries.test.rpcservice.repository.TestUserRepository;

import java.util.List;

@RpcService
public class TestUserRpcService {
    @AutoWired
    private TestUserRepository testUserRepository;

    @ServiceId("GET-TEST-USER-ONE")
    public TestUser getOne(String id) {
        System.out.println("rpc service received param id:" + id);
        return testUserRepository.getOne(id);
    }


    @ServiceId("GET-TEST-USER-ALL")
    public List<UserDO> all(String id) {
        return testUserRepository.all();
    }
}
