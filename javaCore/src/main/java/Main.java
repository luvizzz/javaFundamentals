import accessModifier.Calculator;
import accessModifier.ScientificCalculator;
import accessModifier2.GraphingCalculator;
import classAndObjects.Car;
import commonObjectMethods.CommonMethods;
import constructor.Person;
import exercise.CharSequenceExercise;

import java.time.LocalDate;

public class Main {

    public static void main(String args[]) {
        System.out.println("|-------------------------------------------|");
        System.out.println("|Demonstrating examples of Java Fundamentals|");
        System.out.println("|-------------------------------------------|");

        System.out.println();
        classAndObjectsExample();

//        System.out.println();
//        primitiveAndObjectsExample();
//
//        System.out.println();
//        constructorExample();
//
//        System.out.println();
//        accessModifiersExample();
//
//        System.out.println();
//        commonObjectMethodsExample();
//
//        System.out.println();
//        collectionsExample();
//
//        System.out.println();
//        exercise();
    }

    public static void classAndObjectsExample() {
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        System.out.println("MyCar1.brand: " + myCar1.getBrand());

        System.out.println();
        myCar1.setBrand("Volkswagen");
        System.out.println("MyCar1.brand: " + myCar1.getBrand());
        System.out.println("MyCar2.brand: " + myCar2.getBrand());

        System.out.println();
        myCar2.setColor("blue");
        System.out.println("MyCar1.color: " + myCar1.getColor());
        System.out.println("MyCar2.color: " + myCar2.getColor());

        System.out.println();
        myCar2.setBrand("Ford");
        System.out.println("MyCar1.brand: " + myCar1.getBrand());
        System.out.println("MyCar2.brand: " + myCar2.getBrand());

        System.out.println();
        myCar1.setKms(10000);
        myCar2.setKms(myCar1.getKms() + 2000);
        System.out.println("MyCar1.kms: " + myCar1.getKms());
        System.out.println("MyCar2.kms: " + myCar2.getKms());

        System.out.println();
        System.out.println();
        System.out.println(myCar1.getCarInfo());
        System.out.println();
        System.out.println(myCar2.getCarInfo());
    }

    public static void primitiveAndObjectsExample() {
        System.out.println("Primitive types and Objects Example:");
        System.out.println("------------------------------------");

        /*
        type        default value
        -------------------------
        byte	    0
        short	    0
        int	        0
        long	    0L
        float	    0.0f
        double	    0.0d
        char	    '\u0000'
        boolean	    false
        String      null <= or any other object
         */

        //byte byte1 = new byte();
        byte byte2 = 1;
        System.out.println(String.format("byte2 is %b", byte2));

        //short short1 = new short();
        short short2 = 10;
        System.out.println(String.format("short2 is %d", short2));

        //int int1 = new int();
        int int2 = 100;
        System.out.println(String.format("int2 is %d", int2));

        //long long1 = new long();
        long long2 = 1000000L;
        System.out.println(String.format("long2 is %d", long2));

        //float float1 = new float();
        float float2 = 0.0004f;
        System.out.println(String.format("float2 is %f", float2));

        //double double1 = new double();
        double double2 = 10.02d;
        System.out.println(String.format("double2 is %f", double2));

        //char char1 = new char();
        char char2 = 'a';
        System.out.println(String.format("char2 is %s", char2));

        //boolean boolean1 = new boolean();
        boolean boolean2 = true;
        System.out.println(String.format("boolean2 is %b", boolean2));
        //boolean2.

        Object string1 = new String("My String1");
        System.out.println(String.format("string1 has value '%s' and is of class '%s'", string1, string1.getClass()));
        //string1.

        String string2 = new String("My String2");
        System.out.println(String.format("string2 has value '%s' and is of class '%s'", string2, string2.getClass()));
    }

    public static void constructorExample() {
        System.out.println("Constructors Example:");
        System.out.println("---------------------");

        //Person person1 = new Person();
        //System.out.println(person1.toString());

        Person person2 = new Person("Me!");
        System.out.println(person2.toString());

        Person person3 = new Person(
                "Person3",
                LocalDate.now().minusYears(15)
        );
        System.out.println(person3.toString());

        Person person4 = new Person(
                "person4",
                LocalDate.now().minusYears(20),
                "black",
                180,
                100
        );
        System.out.println(person4.toString());
    }

    public static void accessModifiersExample() {
        System.out.println("Access Modifiers Example:");
        System.out.println("-------------------------");
        printAccessLevelInfo();

        Calculator calculator1 = new Calculator("3", "+", "1", "2");
        System.out.println(calculator1.toString());
        System.out.println();

        Calculator calculator2 = new Calculator("30", "++", "10", "20");
        calculator2.result = "40";
        System.out.println(calculator2.toString());
        System.out.println();

        ScientificCalculator scientificCalculator1 = new ScientificCalculator("8", "+", "5", "3");
        System.out.println(scientificCalculator1.toString());
        System.out.println(String.format("Only accessible value from [world] is: %s", scientificCalculator1.result));
        System.out.println(scientificCalculator1.getAvailableAttributes());
        System.out.println();

        GraphingCalculator graphingCalculator1 = new GraphingCalculator("8", "+", "5", "3");
        System.out.println(graphingCalculator1.toString());
        System.out.println(String.format("Only accessible value from [world] is: %s", graphingCalculator1.result));
        System.out.println(graphingCalculator1.getAvailableAttributes());
        System.out.println();

        final String myString = "my string";
        //myString = "test";
        System.out.println(String.format("myString is '%s'", myString));
        //final != finally != finalize
    }

    public static void printAccessLevelInfo() {
        StringBuilder str = new StringBuilder();
        str.append(
                "  Access Levels\n" +
                "  Modifier\tClass\tPackage\tSubclass\tWorld\n" +
                "  ---------------------------------------------\n" +
                "  public\t\tY\t    Y\t    Y\t        Y\n" +
                "  protected\t\tY\t    Y\t    Y\t        N\n" +
                "  no modifier\tY\t    Y\t    N\t        N\n" +
                "  private\t\tY\t    N\t    N\t        N\n");

        System.out.println(str.toString());
    }

    public static void commonObjectMethodsExample() {
        System.out.println("Common Object Methods Example:");
        System.out.println("------------------------------");

        //toString

        //equals

        //hashcode
        Person p1 = new Person("me");
        System.out.println("hash:" + p1.hashCode());

        Person p2 = new Person("me");
        System.out.println("hash:" + p2.hashCode());

        CommonMethods c1 = new CommonMethods(1);
        CommonMethods c2 = new CommonMethods(1);

        printCommonObjectsInfo(c1, c2);
        c2.setSomeValue(2);
        printCommonObjectsInfo(c1, c2);
    }

    public static void printCommonObjectsInfo(CommonMethods c1, CommonMethods c2) {
        System.out.println("c1: " + c1.toString());
        System.out.println("c2: " + c2.toString());
        System.out.println(String.format("hashes: \n - [c1]: %s\n - [c2]: %s",
                c1.hashCode(),
                c2.hashCode()));
        System.out.println(String.format("[c1] equals [c2]: %s\n", c1.equals(c2)));
    }

    public static void collectionsExample() {
        System.out.println("Java Collections Example:");
        System.out.println("-------------------------");


        /*
        AbstractCollection,
        AbstractList,
        AbstractQueue,
        AbstractSequentialList,
        AbstractSet,
        ArrayBlockingQueue,
        ArrayDeque,
        ArrayList,
        AttributeList,
        BeanContextServicesSupport,
        BeanContextSupport,
        ConcurrentHashMap.KeySetView,
        ConcurrentLinkedDeque,
        ConcurrentLinkedQueue,
        ConcurrentSkipListSet,
        CopyOnWriteArrayList,
        CopyOnWriteArraySet,
        DelayQueue,
        EnumSet,
        HashSet,
        JobStateReasons,
        LinkedBlockingDeque,
        LinkedBlockingQueue,
        LinkedHashSet,
        LinkedList,
        LinkedTransferQueue,
        PriorityBlockingQueue,
        PriorityQueue,
        RoleList,
        RoleUnresolvedList,
        Stack,
        SynchronousQueue,
        TreeSet,
        Vector
        */

    }

    public static void exercise() {
        CharSequenceExercise example = new CharSequenceExercise("What is wrong with the following interface?".toCharArray());

        System.out.println(example.length());
        System.out.println(example.charAt(1));
        System.out.println(example.charAt(example.length() - 1));
        System.out.println(example.charAt(example.length() - 10));
        System.out.println(example.invert());
        System.out.println(String.format("example subSequence: '%s'", example.subSequence(2,example.length() - 2)));
        System.out.println(String.format("example subSequence: '%s'", example.subSequence(2,2)));
        //System.out.println(example.subSequence(2, example.length()).toString());
        //System.out.println(example.subSequence(example.length() + 1, example.length() - 2).toString());
        //System.out.println(example.subSequence(0, example.length()).toString());
        String test = "What is wrong with the following interface?";
        //System.out.println(example.charAt(example.length()));
        //System.out.println(test.subSequence(108,0));
        System.out.println(String.format("test subSequence: '%s'", test.subSequence(2,2)));
    }
}
