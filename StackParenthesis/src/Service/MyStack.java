package Service;

import java.util.Stack;

public class MyStack {
	public boolean checkParanthesis(String s) {
		Stack<Character> stk=new Stack();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(' || s.charAt(i)=='{' ||s.charAt(i)=='[')
				stk.push(s.charAt(i));
			else{
				if(stk.isEmpty()) 
					return false;	
				else
					switch(s.charAt(i)) {
						case ')':
							if(stk.pop()!='(')
								return false;
							break;
						case '}':
							if(stk.pop()!='{')
								return false;
							break;
						case ']':
							if(stk.pop()!='[') 
								return false;
							break;
						default:
							System.out.println("Entered character is not a parenthesis");
							return false;
					}
			}
		}
		if(stk.isEmpty())
			return true;
		else
			return false;
		
	}
}
