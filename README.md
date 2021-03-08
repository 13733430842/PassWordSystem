# PassWordSystem
# 新增随机秘钥的密码系统(摩斯密码和自制(zh)密码)

``` 
public static void main(String[] args) {
		 /**
		 * 摩斯密码(不能加密中文)
		 * zh密码(自制密码)
     * 这里我使用了两种加密方式，先使用自制的加密，然后使用摩斯加密进行二次加密
     * 可以分开单独使用
		 */
		System.out.println("————————————摩斯和zh密码系统—————————————");
    
    //国际通用的摩斯密码（扩展符号还加入了一点自创的摩斯码）
		Encryption encryption=new Encryption();//摩斯加密
		Decryption decryption=new Decryption();//摩斯解密
    
    //自制密码有三种模式，分别是1、2、3
		ASCII ascii=new ASCII();//自制加密
		Resuilt resuilt=new Resuilt(1);//自制解密
    
		ascii.setpwd("星曦向荣");//输入加密内容
		String string=ascii.getresuilt(1);//使用加密1的模式，获得密文
		resuilt.setpwd(string);//使用相应的模式进行解密
    
		encryption.setpwd(string);//将自制加密的密文进行摩斯密码的二次加密
		decryption.setpwd(encryption.getresuilt());//使用摩斯解密
    
		System.out.println("zh加密："+string);//自制加密的密文
		System.out.println("zh解密："+resuilt.getresuilt());//自制解密的明文
		System.out.println("摩斯加密："+encryption.getresuilt());//摩斯加密的密文（这里是二次加密，因为这里加密的内容是自制加密的密文）
		System.out.println("摩斯解密："+decryption.getresuilt());//摩斯解密的明文（这里解密得到的明文是自制加密的密文）
		System.out.println("zh加密长度："+string.length());//自制加密的密文长度
		System.out.println("mosi加密长度："+encryption.getresuilt().length());//摩斯加密的密文长度
		/**
		 * 随机秘钥密码
		 * 注意：加密的字符长度越长耗时越长
		 */
		System.out.println("————————————随机秘钥系统—————————————");
		jiami jiami=new jiami("星曦向荣");//加密，输入加密内容
		String miwen=jiami.Resuilt();//获得加密后的密文
		String miyao=jiami.getMiyao();//获得对应的秘钥
		jiemi jiemi=new jiemi(miwen,miyao);//解密，将密文和对应的秘钥输入
		System.out.println("加密密文:"+miwen+"\n随机秘钥:"+miyao);
		System.out.println("解密明文:"+jiemi.Resuilt());//得到解密后的明文
	}
```
