class Main{
    public static void main(String[] args){
        int number1=  Integer.parseInt(args[0]);
        String op= args[1];
        int number2 =  Integer.parseInt(args[2]);
        int result=0;
        switch(op){
            case "+" -> {
                result = number1+ number2;
            }
            case "-" -> {result = number1- number2;
            }
            case "/" -> {result = number1/ number2;
            }
            case "*" -> { result = number1* number2;
            }
        }
        System.out.println(result);

    }
}