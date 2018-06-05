package com.aries.test.rpcservice.repository;

import com.aries.server.annotation.Repository;
import com.aries.test.domain.TestUser;
import com.aries.test.domain.UserDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.io.ResolverUtil;

import java.util.List;

@Repository
public interface TestUserRepository {
    @Select("select * from user where id = #{id}")
    TestUser getOne(@Param("id") String id);

    @Select("select * from user where 1=1")
    List<UserDO> all();
}
