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
		 * Ħ˹����(���ܼ�������)
		 * zh����(��������)
		 */
		System.out.println("������������������������Ħ˹��zh����ϵͳ��������������������������");
		Encryption encryption=new Encryption();//Ħ˹����
		Decryption decryption=new Decryption();//Ħ˹����
		ASCII ascii=new ASCII();//���Ƽ���
		Resuilt resuilt=new Resuilt(1);//���ƽ���
		ascii.setpwd("��������");
		String string=ascii.getresuilt(1);
		resuilt.setpwd(string);
		encryption.setpwd(string);
		decryption.setpwd(encryption.getresuilt());
		System.out.println("zh���ܣ�"+string);
		System.out.println("zh���ܣ�"+resuilt.getresuilt());
		System.out.println("mosi���ܣ�"+encryption.getresuilt());
		System.out.println("Ħ˹���ܣ�"+decryption.getresuilt());
		System.out.println("zh���ܳ��ȣ�"+string.length());
		System.out.println("mosi���ܳ��ȣ�"+encryption.getresuilt().length());

		/**
		 * �����Կ����
		 * ע�⣺���ܵ��ַ�����Խ����ʱԽ��
		 */
		System.out.println("�����������������������������Կϵͳ��������������������������");
		jiami jiami=new jiami("��������");//����
		String miwen=jiami.Resuilt();
		String miyao=jiami.getMiyao();
		jiemi jiemi=new jiemi(miwen,miyao);//����
		System.out.println("��������:"+miwen+"\n�����Կ:"+miyao);
		System.out.println("��������:"+jiemi.Resuilt());

	}

}
