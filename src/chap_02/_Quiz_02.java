package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 115;
        int heihgter = 121;

        String result = (height >= 120) ? "키가 120cm 이상이므로 탑승 가능 합니다" : "키가 115cm 이므로 탑승 불가능합니다";
        System.out.println(result);

        String d = (heihgter >= 120) ? "키가 121cm 이므로 탑승 가능합니다" : "키가 120 이하이므로 탑승 불가능합니다";
        System.out.println(d);

        // 다른 방법
        int a = 115;
        String b = (a >= 120) ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가 " + a + "cm 이므로 " + b);
    }
}
