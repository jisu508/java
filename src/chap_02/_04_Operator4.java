package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // ' || ' 우리한텐 ' OR ' 이랑 똑같음
        // 하나라도 true면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // ' && ' 우리한텐 ' and ' 임
        // 셋 모두 true여야 true

        // And 연산
        System.out.println((5 > 3) && (3 > 1)); //5는 3보다 크고, 3은 1보다 크다 (true)
        System.out.println((5 > 3) && (3 < 1)); // (false)

        // Or 연산
        System.out.println((5 > 3) || (3 > 1)); // 5는 3보다 크거나, 3은 1보다 크다 (true)
        System.out.println((5 > 3) || (3 < 1)); // (true) 괄호 없이 해도 됨 가독성을 위해 괄호 씀

        // System.out.println(1 < 3 < 5);  불가능한 코드

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true
    }
}
