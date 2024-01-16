class strget{
    public static void main(String args[]){
        String org="Welcome to BMSCE college";
        int start=11,end=16;
        char chars[]=new char[end-start];
        org.getChars(start,end,chars,0);
        System.out.println(chars);
    }
}