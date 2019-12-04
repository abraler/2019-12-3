public class Main {
    public static StringBuffer replaceSpace(StringBuffer str) {
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                str.insert(i,"%10");
            }
        }
        return  str;
    }
    public static void main(String[] args) {
        StringBuffer a=new StringBuffer("www www www");
        System.out.println(a);
        StringBuffer b= replaceSpace(a);
        System.out.println(b);
    }
}
