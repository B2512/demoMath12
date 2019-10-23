package b2512.wuzhangjie;

public class Main {
    public static void main(String[] args) {
//        String str[] = new String[]{"fl2ower","flow","floght"};
//        String pic = str[0];
//        for (int a=0;a<str.length;a++){
//            while (str[a].indexOf(pic)!=0){
//                pic=pic.substring(0,pic.length()-1);
//            }
//        }
//        System.out.print(pic);

















        String str[] = new String[]{"f2ower","f2ow","f2ight"};
        String pic = str[0];
        for (int i=0;i<str.length;i++){
            System.out.println(str[i].indexOf(pic));
            while (str[i].indexOf(pic)!=0){//如果不正确
                pic = pic.substring(0,pic.length()-1);//每次减一位
            }
        }
        System.out.println(pic);
    }
}
