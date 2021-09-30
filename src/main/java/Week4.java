import sun.nio.cs.ext.MacThai;

public class Week4 {
    /**
     *
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        if (a > b) return a;
        return b;
    }

    /**
     *
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int minn = arr[0];
        for (int i : arr) {
            if (minn > i) {
                minn = i;
            }
        }
        return minn;
    }

    /**
     *
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = (double)Math.round(weight / height / height * 10) / 10;

        if (BMI < 18.5) {
            return "Thiếu cân";
        }
        else if (18.5 <= BMI && BMI <= 22.9) {
            return "Bình thường";
        }
        else if (23 <= BMI && BMI <= 24.9) {
            return "Thừa cân";
        }
        else {
            return "Béo phì";
        }
    }

    public static void main(String[] args) {
        System.out.println(calculateBMI(50, 1.8));
    }
}