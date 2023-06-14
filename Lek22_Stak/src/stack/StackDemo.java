package stack;

public class StackDemo {
    public static void main(String[] args) {
        //  StackI s = new NodeStack();
        StackI s = new ArrayStack(5);
        s.push("Tom");
        s.push("Diana");
        s.push("Harry");
        s.push("Thomas");
        s.push("Bob");
        s.push("Brian");
        System.out.println(s.peek());
        System.out.println(s.isEmpty() + " " + s.size());
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        System.out.println();
        System.out.println(s.isEmpty() + " " + s.size());
        System.out.println();

        // -------- test af reverse --------

//        Integer[] tal = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        reverse(tal);
//        for (int i = 0; i < tal.length; i++) {
//            System.out.print(tal[i] + " ");
//        }

        String validStr = "(3 + {5{99{ *}}[23[{67} 67]]})";
        String inValidStr = "(}){";
        System.out.println(checkParantes(validStr));
        System.out.println(checkParantes(inValidStr));
        System.out.println();

        DOArrayStack dropOutStack = new DOArrayStack(3);
        dropOutStack.push("Tom");
        dropOutStack.push("Diana");
        dropOutStack.push("Harry");
        dropOutStack.push("Thomas");

        while (!dropOutStack.isEmpty()) {
            System.out.println(dropOutStack.pop());
        }
    }

    public static void reverse(Object[] tabel) {
        StackI stack = new ArrayStack(tabel.length);
        // StackI stack = new NodeStack();
        for (int i = 0; i < tabel.length; i++) {
            stack.push(tabel[i]);
        }
        int i = 0;
        while (!stack.isEmpty()) {
            tabel[i] = stack.pop();
            i++;
        }
    }

    public static boolean checkParantes(String s) {
        StackI stack = new ArrayStack(s.length());
//         StackI stack = new NodeStack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = (char) stack.pop();
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
