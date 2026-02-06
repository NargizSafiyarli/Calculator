class Main{
    public static void main(String[] args){
        int score = Integer.parseInt(args[0]);
        if (args.length == 0) {
            System.out.println("Usage: java Main <score>");
            return;
        }
        if (score<1 || score>100){
            System.out.println("Invalid score");
            return;
        }
        if(score>=90 && score<=100){
            System.out.println("A");
        }else if(score>=80 && score<90){
            System.out.println("B");
        } else if (score>=70 && score<80) {
            System.out.println("C");
        } else if (score>=60 && score<70) {
            System.out.println("D");
        }else System.out.println("F");

    }
}