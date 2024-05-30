public class typeCasting {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // 자동 형변환 int->double 당연히 실수까지 표현하는 더블로 바뀐것이니 데이터 손실이 없다
            //반대의 경우 데이터 손실이 생긴다
        // double a = 10.5 라면 출력은 10으로 int의 경우 정수형이므로 10으로 출력
        //long에서 int으로 형변환하는 경우 아예 데이터구간을 벗어날 수 있는데 이 경우를 오버플로우라고한다.
    }
}
