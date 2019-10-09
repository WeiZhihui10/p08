package cn.lingnan.service.serviceimpl;

import cn.lingnan.bean.User;
import cn.lingnan.dao.UserMapper;
import cn.lingnan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceimpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findUserByUsernameAndUserpwd(String username, String userpwd) {
        User user=userMapper.findUserByUsername(username,userpwd);
        return user;
    }
}
