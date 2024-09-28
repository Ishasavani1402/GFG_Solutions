class perfactnum {
    static int isperfact(long n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isperfact(6));
    }
}