package com.javaspring.api.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.javaspring.api.service.ServiceImpl;


@RestController
public class Controller {
	
	@Autowired
	ServiceImpl serve;
	
	@RequestMapping("/")
	public ModelAndView begin()
	{
		return new ModelAndView("File");
	}
	
	@RequestMapping(value="/check",method=RequestMethod.POST)
	public ModelAndView compareWithUser(@RequestParam("pick") String userPick){
		System.out.println(userPick);
		int randomNumber = (int)(Math. random()*(3));
        HashMap<Integer , String> map =new HashMap<>();
        map.put(0,"rock");
        map.put(1,"paper");
        map.put(2,"scissor");
        
        String compPick = map.get(randomNumber);
        StringBuilder actualWinner =new StringBuilder();
        System.out.println("\nUSER MOVE:"+userPick+"\nCPU MOVE:"+compPick);
        if(userPick.equals(compPick))
        {
        	System.out.println("Match Tied");
        	return new ModelAndView("Dummy").addObject("winner","Match Tied");
        }
        else
        {
        	 String winnersMove=ServiceImpl.whoWon(userPick,compPick);
             
             System.out.println("\nWinner is : "+winnersMove);
             
             
             if(winnersMove.equals(compPick))
             {
             	actualWinner.append("Computer Won");
             }
             else
             {
             	actualWinner.append("User Won");
             }
             
             System.out.println("\nActualWinner is : "+actualWinner);
        }
       
        
        return new ModelAndView("Dummy").addObject("winner",actualWinner).addObject("userMove",userPick).addObject("compMove",compPick);
		
		
	}

}
