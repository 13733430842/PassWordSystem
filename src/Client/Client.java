package Client;

import math.math;
import mosi.Decryption;
import mosi.Encryption;
import zh.ASCII;
import zh.Resuilt;
import zh_miyao.jiami;
import zh_miyao.jiemi;

public class Client {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * 摩斯密码(不能加密中文)
		 * zh密码(自制密码)
		 */
		System.out.println("————————————摩斯和zh密码系统—————————————");
		Encryption encryption=new Encryption();//摩斯加密
		Decryption decryption=new Decryption();//摩斯解密
		ASCII ascii=new ASCII();//自制加密
		Resuilt resuilt=new Resuilt(1);//自制解密
		ascii.setpwd("星曦向荣");
		String string=ascii.getresuilt(1);
		resuilt.setpwd(string);
		encryption.setpwd(string);
		decryption.setpwd(encryption.getresuilt());
		System.out.println("zh加密："+string);
		System.out.println("zh解密："+resuilt.getresuilt());
		System.out.println("mosi加密："+encryption.getresuilt());
		System.out.println("摩斯解密："+decryption.getresuilt());
		System.out.println("zh加密长度："+string.length());
		System.out.println("mosi加密长度："+encryption.getresuilt().length());

		/**
		 * 随机秘钥密码
		 * 注意：加密的字符长度越长耗时越长
		 */
		System.out.println("————————————随机秘钥系统—————————————");
		jiami jiami=new jiami("星曦向荣");//加密
		String miwen=jiami.Resuilt();
		String miyao=jiami.getMiyao();
		jiemi jiemi=new jiemi(miwen,miyao);//解密
		System.out.println("加密密文:"+miwen+"\n随机秘钥:"+miyao);
		System.out.println("解密明文:"+jiemi.Resuilt());

	}

}
