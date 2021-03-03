import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /*
        //1a
        StringBuilder stringBuilder = new StringBuilder("H");
        stringBuilder.append("e");
        stringBuilder.append("l");
        stringBuilder.append("l");
        stringBuilder.append("o");
        System.out.println(stringBuilder);

        //1b checking if word is palindrome
        String[] words = {"hello", "world", "radar", "math", "kayak", "bank", "rotor"};
        for (int i = 0; i < words.length; i++) {
            StringBuilder temp = new StringBuilder(words[i]);
            if (words[i].equals(temp.reverse().toString())) {
                System.out.println(temp);
            }
        }

        //2
        String out = String.format("%s -- %d","Alex",35);
        System.out.println(out);
        System.out.printf("%s %d","Alex",35);
        //give as exception


        //3
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches(".*[a]+.*")) {
                System.out.println(words[i] + " contains a");
            } else {
                System.out.println(words[i] + " does not contains a");
            }
        }


        //4
        // Java Generic methods and generic classes
        //enable programmers to specify,
        // with a single method declaration,
        // a set of related methods,
        // or with a single class declaration,
        // a set of related types, respectively.


        //5
        // Create arrays of Integer, Double and Char
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        printArray(intArray);

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);

        System.out.println("\nArray characterArray contains:");
        printArray(charArray);


        //6  ????

        //7
        String word = "Dictionary";
        StringBuilder str = new StringBuilder(word);
        int aIndex = str.indexOf("a");
        System.out.println(aIndex);
        str.replace(aIndex,aIndex+1,"x");
        System.out.println(str);


        //8
        Method[] allMethods = String.class.getDeclaredMethods();
        int totalPublicMethods = 0;
        for (Method method : allMethods) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println(method);
                totalPublicMethods++;
            }
        }
        System.out.println("Count is: " + totalPublicMethods);
*/


        //9
        User user = new User("Alex");
        Method privateStringMethod = User.class.getDeclaredMethod("getName");
        privateStringMethod.setAccessible(true);
        String name = (String) privateStringMethod.invoke(user);
        System.out.println(name);

        //10
        String REGEX = "dog";
        String INPUT = "The dog says meow. All dogs say meow.";
        String REPLACE = "cat";
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);


    }


    public static < E > void printArray( E[] inputArray ) {
        // Print array elements
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
