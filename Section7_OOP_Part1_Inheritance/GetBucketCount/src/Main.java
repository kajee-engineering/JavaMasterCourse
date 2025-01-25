package Section7_OOP_Part1_Inheritance.GetBucketCount.src;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(1, 1, 1, 0));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(2.75, 3.25));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(-3.4, 1.5));
        System.out.println(getBucketCount(3.26, 2.15, 0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {

            return -1;
        }

        double total = width * height;
        double totalBucket = Math.ceil(total / areaPerBucket);

        return (int) (totalBucket - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}
