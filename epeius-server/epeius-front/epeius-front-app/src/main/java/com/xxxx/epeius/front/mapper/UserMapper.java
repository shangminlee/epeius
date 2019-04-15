package com.xxxx.epeius.front.mapper;

import com.xxxx.epeius.front.model.User;
import com.xxxx.epeius.front.param.UserParam;

import java.util.List;

/**
 * Description: 数据库存储示例代码
 * Author: lishangmin
 * Created: 2019-04-14 22:30
 */
public interface UserMapper {

	List<User> getAll();

	List<User> getList(UserParam userParam);

	int getCount(UserParam userParam);

	User getOne(Long id);

	void insert(User user);

	int update(User user);

	int delete(Long id);

}
