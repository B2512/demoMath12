package liwenjian;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String [] Prefix=new String[]{"abchjgk","abcgfghk","abcugfh"};
        String p = Prefix[0];//取出数组的第一个字符串，
        for (int i=0;i<Prefix.length;i++){
            System.out.println(Prefix[i].indexOf(p));
            while(Prefix[i].indexOf(p) != 0){
                p = p.substring(0,p.length()-1);//*一次减少一个元素,如果p剩余的元素完全能找到则跳出
            }
        }
        System.out.println(p);
    }
}
