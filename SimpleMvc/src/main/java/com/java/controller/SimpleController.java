package com.java.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.beans.User;
import com.java.logic.api.ILogic;
import com.java.utils.AddressType;


@Controller
public class SimpleController {
	
	private static final Logger LOG = Logger.getLogger(SimpleController.class);
	
	String message ="Welcome";
	
	@Autowired
	private ILogic logic;
	
	
	@RequestMapping("/hello")
	public ModelAndView redirectToWelcomePage(@RequestParam(value="name", required =false, defaultValue ="!") String name){
		LOG.debug("Rediret to Welcome Page : {}"+name);
		
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name",name);
		
		if(logic.checkDbConnection()){
			
			modelAndView.setViewName(message);
			modelAndView.addObject("message",message);
			modelAndView.addObject("name",name);
			
			return modelAndView;
			
		}
		LOG.debug("DB Connection not stable");
		modelAndView.setViewName("ConnectionInterupt");
		modelAndView.addObject("message","Db Connection Not Stable");
		return modelAndView;
		
	}
	
	@ModelAttribute("addressTypes")
    public Map initializeSubjects() {
		
        return getAddressTypes();
    }
	
	@RequestMapping("/registerForm")
	public ModelAndView redirectToRegistrationPage(@RequestParam(value="name") String name, Model model){
	
		LOG.debug("Rediret to Registration Page : "+name);
		System.out.println("Rediret to Registration Page : "+name);
		
		ModelAndView modelAndView = new ModelAndView("RegisterationPage");
		modelAndView.addObject("name",name);
		//modelAndView.addObject("addressTypes", getAddressTypes());
		modelAndView.addObject("regUser",new User());
			
		return modelAndView;

	}
	
	
	@RequestMapping("/register")
	
	public ModelAndView processRegistration(@Valid @ModelAttribute("regUser")User registrationUser, BindingResult result, 
			@RequestParam(value="name") String name, ModelMap model){
	
		ModelAndView modelAndView = new ModelAndView();
		
		
		if(result.hasErrors())
		{
			LOG.debug("Error Occured While Registration : "+result);
			modelAndView.setViewName("RegisterationPage");
			modelAndView.addObject("name",name);
			modelAndView.addObject("regUser",new User());
			return modelAndView;
		}
		
		LOG.debug("Process Registration : "+registrationUser.getName());
		
		modelAndView.setViewName("ConfirmRegistration");
		logic.checkUser(registrationUser);
		modelAndView.addObject("regUser",registrationUser);
		modelAndView.getModelMap().addAttribute("regUser", registrationUser);
		
		
		return modelAndView;
	}
	
	
	@RequestMapping("/confirmRegistration")
	public ModelAndView confirmRegistration( @RequestParam Map<String, String> requestParams, @ModelAttribute("regUser") User registrationUser, 
			ModelMap modelMap, HttpServletRequest request){
	
		for (Entry<String, Object> requestParam : modelMap.entrySet()) {
			
			LOG.debug("Key "+requestParam.getKey()+" Value "+requestParam.getValue());
		}
		LOG.debug("Confirm User registration User :"+registrationUser);
		ModelAndView modelAndView = new ModelAndView();
		
		if(null == registrationUser.getName() || registrationUser.getName().isEmpty()){
			
			modelAndView.setViewName("ConnectionInterupt");
			modelAndView.addObject("message","Registration Details Incomplete");
			return modelAndView;
		}
		
		registrationUser = logic.registerUser(registrationUser);
		
		modelAndView.addObject("title", "Registration Success");
		modelAndView.addObject("message", "Registration is success with User Id :"+registrationUser.getUserId());
		
		modelAndView.setViewName("Success");
		return modelAndView;
		
	}
	
	private Map getAddressTypes(){
		
		Map<Integer,String> addressTypeMap = new HashMap<Integer,String>();
		
		AddressType[] addressTypes = AddressType.values();
		
		for (AddressType addressType : addressTypes) {
			addressTypeMap.put(addressType.getAddressType(), addressType.name());
		}
		
		return addressTypeMap;
	}

	public ILogic getLogic() {
		return logic;
	}

	public void setLogic(ILogic logic) {
		this.logic = logic;
	}
	
	
}
