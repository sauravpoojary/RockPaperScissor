package com.javaspring.api.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl {
	
	public static String whoWon(String a,String b)
	{
		
	    if(!a.equals(b))
	    {
	        switch(a)
	        {
	            case "rock" :
	            if(b.equals("scissor"))
	            {
	                return "rock";
	            }
	            else
	            {
	                return "paper";
	            }
	        
	            case "paper" :
	            if(b.equals("scissor"))
	            {
	                return "scissor";
	            }
	            else
	            {
	                return "paper";
	            }
	     
	            
	            case "scissor" :
	            if(b.equals("rock"))
	            {
	                return "rock";
	            }
	            else
	            {
	                return "scissor";
	            }

	        }
	    }
	    
	    
	    return "Tie";
	    
	}

}
