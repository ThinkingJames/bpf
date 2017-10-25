package cn.net.ssbt.modules.sys.controller;

import cn.net.ssbt.common.web.BaseController;
import cn.net.ssbt.modules.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录Controller
 * @author hsl
 */
@Controller
public class LoginController extends BaseController {
	
	@Autowired
	private UserService service;

	@RequestMapping("/login")
	public String getName(){
		System.out.println(service.getName("4B7A5CD338F44569B0291EB5B0482EEC"));
		return "modules/sys/login";
	}
}
