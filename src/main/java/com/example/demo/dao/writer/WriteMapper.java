package com.example.demo.dao.writer;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wuwei
 * @date 2018/5/24 11:47
 */
@Mapper
public interface WriteMapper {
    int addUser(User user);

    int updateUser(User user);

    int delUser(String userId);

    int delUsers(String[] userIds);
}
