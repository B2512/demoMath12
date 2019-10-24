package b2512.huangsai;


public class Main {
    public static void main(String[] args) {
        String[] names = new String[]{"ffaom","fflfd","ffom"};
        String minstr = names[0];
        for (int i =0;i<names.length;i++){
//            System.out.println(names[i].indexOf(minstr));
////            //从最短开始比较
////            if (minstr.length()>names[i].length()){
////                minstr = names[i];
////            }
            while (names[i].indexOf(minstr)!=0){ // 比较 indexOf: 0相等  -1不相等
                minstr = minstr.substring(0,minstr.length()-1); //substring:截取
            }
        }
        System.out.println(minstr);
    }
}
