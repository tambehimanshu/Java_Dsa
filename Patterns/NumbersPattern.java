class NumbersPattern {
    public static void main(String[] args) {
      int counter =1;
      int row =5;
        for(int i =1 ;i<=row;i++){
            for(int j =1;j<=i;j++){
                System.out.print(counter +" ");
                counter++;
            }
            System.out.println();
        }
    }
}
