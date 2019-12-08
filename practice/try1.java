class try1{
    public static void main(String[] args) {
        StringBuffer b = new StringBuffer(3);
        b.append("ayushjain.");
        System.out.println(b.capacity());
        System.out.println(b.length());
        b.setCharAt(4,'a');
        System.out.println(b);
    }
}