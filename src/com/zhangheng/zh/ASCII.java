package com.zhangheng.zh;

import com.zhangheng.err.GetError;

import java.util.ArrayList;

/**
 * zh密码加密
 */
public class ASCII {
private String pwd;
private int mode;
	private Exception Exception;

	public ASCII(String pwd,int mode) {
		if (pwd.isEmpty()){
			throw new NullPointerException("参数'pwd'为空");
		}else {
			this.pwd = pwd;
		}
		this.mode=mode;
	}

private ArrayList<Character> characters(){
	ArrayList<Character> characters=new ArrayList<Character>();
	for (int i = 0; i < pwd.length(); i++) {
		characters.add(pwd.charAt(i));
	}
	return characters;
}
private ArrayList<Integer> integers(){
	ArrayList<Integer> integers=new ArrayList<Integer>();
	for (int i = 0; i < characters().size(); i++) {
		integers.add(Integer.valueOf(characters().get(i)));
	}
	return integers;
}
public String getresuilt()  {//将集合转换为字符串
	
	String str="";
	for (int i = 0; i <integers().size(); i++) {
		switch (mode) {
			case 1:
				str += String.valueOf(integers().get(i) + ((i + 2) * (i + 1))) + " ";    //加密1 x+((i+1)*(i+2))
				break;
			case 2:
				str += String.valueOf(integers().get(i) + ((i + integers().size()) * (i + 1))) + " ";        //加密2
				break;
			case 3:
				str += String.valueOf(integers().get(i) + ((integers().size() - i) * (i + 1))) + " ";        //加密2.1
				break;
			default:
				GetError.err1();
				break;
		}

	}
	return str;
}


}
