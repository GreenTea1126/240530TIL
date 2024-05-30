public class dataType {
    // 데이터 타입이란
    // 원시타입과 참조타입으로 나뉨

    //원시(기본형,정수형)타입
    // byte,short,int,long(숫자끝에 L)
    // 주로 int 사용하고 20억이 넘어가면 long을 사용한다
    //원시(기본형,실수형)타입 ex)1.5,2.5
    // float(숫자끝에 f),double
    //주로 d를 사용함
    public static void main(String[] args) {
        float floatNumber = 123456.789f;
        double doubleNumber = 123456.789;

        System.out.println("float:" + floatNumber);
        System.out.println("double:" + doubleNumber);
    }
}
    //원시(기본형,문자형)타입 : char
    //논리형 : boolean isTrue : true; (or false; 두개만 저장가능)
    //문자"열" : String str = "apple";