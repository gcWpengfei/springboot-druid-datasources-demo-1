package com.example.demo.dao.read;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wuwei
 * @date 2018/5/24 11:34
 */
@Mapper
public interface ReadMapper {
    List<User> findAllUser();

    User findUserById(String userId);
}
