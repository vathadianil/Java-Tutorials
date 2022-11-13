public class Main {
    public static void main(String[] args) {

        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println((myMinByteValue));
        System.out.println(myMaxByteValue);

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println((myMinShortValue));
        System.out.println(myMaxShortValue);

        int myMinIntegerValue = Integer.MIN_VALUE;
        int myMaxIntegerValue = Integer.MAX_VALUE;
        System.out.println(myMinIntegerValue);
        System.out.println(myMaxIntegerValue);

        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);

        int myInt = (myMinIntegerValue/2);
        System.out.println((myInt));

        byte myByte =(byte) (myMinByteValue/2);
        System.out.println(myByte);

        short myShort =(short) (myMinShortValue/2);
        System.out.println(myShort);

        long myLong = (myMinLongValue/2);
        System.out.println(myLong);
    }
}