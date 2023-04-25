package com.gl.dsa;
import java.util.*;

public class BalancedString {
	@SuppressWarnings({ "rawtypes", "unchecked" })   
	public boolean balancedString(String in) {
		Stack stack = new Stack();
		char [] charArr = in.toCharArray();
		for (int i = 0; i < charArr.length;i++) {
	 		char cur = charArr[i];
			if (cur == '{'|| cur == '['|| cur == '(') {
				stack.push(cur);
				continue;
			}
			if(stack.isEmpty()) {
				return false;
			}
			char chPop;
			switch(cur) {
				case ')': chPop = (char) stack.pop();
					if(chPop == '{' || chPop == '[')
						return false;
					break;
				case '}': chPop = (char)stack.pop();
					if(chPop == '(' || chPop == '[')
						return false;
					break;
				case ']': chPop = (char)stack.pop();
					if(chPop == '(' || chPop == '{') 
						return false;
					break;
			}
		}
		return(stack.isEmpty());
	}
}
