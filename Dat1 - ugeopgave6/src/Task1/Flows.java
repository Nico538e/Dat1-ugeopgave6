package Task1;

public class Flows {

    public void methodA(String input) {
        System.out.println("J");
        if (!input.equals("start")) {
            System.out.println("b");
            methodB("start");
        } else {
            System.out.println("a");
            int result = methodC(input);
            System.out.println("");
            System.out.println("e");
           if (result > 0) {
               System.out.println("java er sjovt");

           }

        }

    }

    public void methodB(String start) {
        System.out.println("r");
    }

    public int methodC(String input) {
        System.out.println("v");
        methodD(input.length());
        return input.length() * 2;
    }

    public void methodD(int number) {
        System.out.println("a");
        if (number > 5) {
            System.out.println("t");
        }

    }


}