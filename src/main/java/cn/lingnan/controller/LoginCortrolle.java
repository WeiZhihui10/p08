package cn.lingnan.controller;

import cn.lingnan.bean.User;
import cn.lingnan.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginCortrolle {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(String username,String userpwd){
        System.out.print(username+""+userpwd);
        if(username.equals("zhangsan")&&userpwd.equals("123456")){
            return "success";
        }else{
            return "error";
        }
    }

    @RequestMapping(value = "/login1")
    public void login1(String username, String userpwd, PrintWriter printWriter) throws Exception{
        System.out.print(username+""+userpwd);
        Map<String, Object> map = new HashMap<>();
        if(username==null||userpwd==null||username.equals("")||userpwd.equals("")){
            map.put("msg","用户名密码不能为空");
            printWriter.write(JSON.toJSONString(map));
        }else{
            User user=userService.findUserByUsernameAndUserpwd(username,userpwd);
            if(user!=null) {
                printWriter.write(JSON.toJSONString(user));
            }else {
                map.put("msg","用户名密码不正确");
                printWriter.write(JSON.toJSONString(map));
            }
        }

    }
}
