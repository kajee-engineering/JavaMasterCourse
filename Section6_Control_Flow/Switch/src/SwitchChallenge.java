package Section6_Control_Flow.Switch.src;

public class SwitchChallenge {
    public static void main(String[] args) {
        natoPhonitec('A');
        natoPhonitec('B');
        natoPhonitec('C');
        natoPhonitec('D');
        natoPhonitec('X');
    }

    private static void natoPhonitec(char alphabet) {
        switch (alphabet) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            default :
                System.out.println("Invalid Value");
        }
    }
}
