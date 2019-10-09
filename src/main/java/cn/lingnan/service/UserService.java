package cn.lingnan.service;

import cn.lingnan.bean.User;

public interface UserService {
    public User findUserByUsernameAndUserpwd(String username, String userpwd);
}
