# PassWordSystem
## 在[原项目](https://github.com/ZhangHeng0805/PassWord)的基础上，新增随机秘钥的密码系统(摩斯密码和自制(zh)密码)

``` 
 public static void main(String[] args) {


        /*
        * 摩斯密码
        * 国际通用摩斯密码，自己添加了一些新符号的摩斯码
        * */
        Encryption encryption=new Encryption("123");    //加密
        String re1 = encryption.getresuilt();
        Decryption decryption=new Decryption(re1);      //解密
        String re2 = decryption.getresuilt();
        System.out.println(re1);
        System.out.println(re2);

        /*
        * zh自制密码
        * 3种模式mode任意组合
        * */
        System.out.println("________________________");
        ASCII ascii = new ASCII("123",3);   //加密
        String res1 = ascii.getresuilt();
        Resuilt resuilt=new Resuilt(res1,3);    //解密
        String res2 = resuilt.getresuilt();
        System.out.println(res1);
        System.out.println(res2);

        /*
         * 随机秘钥密码
         * 注意：加密的字符长度越长耗时越长
         **/

        System.out.println("________________________");
        Jiami jiami=new Jiami("123");   //加密
        String miyao = jiami.getMiyao();      //获得秘钥
        String resuilt1 = jiami.Resuilt();    //获得密文
        System.out.println(miyao);
        System.out.println(resuilt1);
        Jiemi jiemi=new Jiemi(resuilt1,miyao);  //解密
        String resuilt2 = jiemi.Resuilt();      //获得解密后的明文
        System.out.println("\n"+resuilt2);

    }
```
