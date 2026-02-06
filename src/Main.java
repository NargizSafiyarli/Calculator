class Main{
    public static void main(String[] args){
        int num1=  Integer.parseInt(args[0]);
        String op= args[1];
        int num2=  Integer.parseInt(args[2]);
        int result=0;
        switch(op){
            case "+" -> {
                result = num1+num2;
            }
            case "-" -> {result = num1-num2;
            }
            case "/" -> {result = num1/num2;
            }
            case "*" -> { result = num1*num2;
            }
        }
        System.out.println(result);

    }
}