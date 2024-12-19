package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도코딩";
        int hour = 15;


        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14;
        float f = 3.14F;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
/*
변수: 문자 = string , 한 글자로 된 문자 = char
     정수 = int , long (표현 할 수 있는 수가 더 큼)
     실수 = double , float (정밀X)
     참과 거짓을 뜻하는 함수 = boolean
 */