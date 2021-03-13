package com.zhangheng.zh;

import com.zhangheng.err.GetError;
import java.util.ArrayList;

/**
 * zh密码解密
 */
public class Resuilt {
	private String pwd;
	private int n;

	public Resuilt(String pwd, int mode) {
		if (pwd.isEmpty()){
			throw new NullPointerException("参数'pwd'为空");
		}else {
			this.pwd = pwd;
		}
		this.n = mode;
	}

	private ArrayList<String> strArrayList(){
		String b=pwd;
		ArrayList<String> list=new ArrayList<String>();
		String[] c=b.split(" ");
		for (int i = 0; i < c.length; i++) {
			String d=c[i];
			d.replaceAll(" ", "");
			list.add(d);
		}
		return list;
	}
	private ArrayList<Character> characters(){
		ArrayList<Integer> integers=new ArrayList<Integer>();
		ArrayList<Character> characters=new ArrayList<Character>();
		for (int i = 0; i < strArrayList().size(); i++) {
			int a=Integer.valueOf(strArrayList().get(i));
			switch (n){
				case 1:
					integers.add(a-((i+2)*(i+1)));		//解密1
					break;
				case 2:
					integers.add(a-((i+strArrayList().size())*(i+1)));	//解密2
					break;
				case 3:
					integers.add(a-((strArrayList().size()-i)*(i+1)));	//解密2.1
					break;
					default:
						GetError.err2();
						break;
			}

		}
		for (int j = 0; j < integers.size(); j++) {
			int b=integers.get(j);
			char c=(char)b;
			characters.add(c);
		}
		return characters;
	}
	public String getresuilt(){
		String string="";
		for (int i = 0; i < characters().size(); i++) {
			string+=characters().get(i);
		}		
		return string;//将集合转换为字符串
	}
}
