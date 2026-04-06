public class DoOp {
    public static String operate(String[] args) {
        if (args.length != 3 ) {
            return "Error";
        }
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[2]);
        String operation = args[1];
        String result = "";
        switch (operation) {
            case "+":
                result = String.valueOf((n1 + n2));
                break;
            case "-":
                result = String.valueOf((n1 - n2));
                break;
            case "*":
                result = String.valueOf((n1 * n2));
                break;
            case "/":
                if (n2 == 0) {
                    return "Error";
                }
                result = String.valueOf((n1 / n2));
                break;
            case "%":
                if (n2 == 0) {
                    return "Error";
                }
                result = String.valueOf((n1 % n2));
                break;
            default:
                return "Error";
        }
        return result;
    }
}