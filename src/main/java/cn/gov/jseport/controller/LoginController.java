package cn.gov.jseport.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.gov.jseport.entity.Userinfo;
import cn.gov.jseport.service.IUserinfoService;

@Controller
public class LoginController {
	@Resource
	private IUserinfoService userinfoServiceImpl;
	@RequestMapping("/login")
	public String login(Userinfo info,HttpSession session) throws Exception {
		info = userinfoServiceImpl.login(info);
		if(info!=null) {
			List trees = info.getTrees();
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(trees);
			session.setAttribute("info", info);
			session.setAttribute("json", json);
			return "admin/index";
		}else {
			return "login";
		}
	}
}
