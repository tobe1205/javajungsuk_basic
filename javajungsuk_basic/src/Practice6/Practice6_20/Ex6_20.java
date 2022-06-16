package Practice6.Practice6_20;

/*
다음과 같이 정의된 메서드를 작성하고 테스트하시오.

 -메서드명 : max
 -기 능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
         만일 주어진 배열이 null이거나 크기가 0인경우, -999999를 반환한다.
 -반환타입 : int
 -매개변수 : int[] arr - 최대값을 구할 배열
 */

import java.util.Arrays;

public class Ex6_20 {

    public static int max(int[] arr) {
        if(arr==null || arr.length==0) //배열에 값이 없거나, 배열의 크기가 0일경우 -999999반환
            return -999999;

        //1번 방법 : 배열의 0번위치값을 max변수에 초기화 후, 1번부터 0번과 비교하여 0번보다 값이 클경우 큰값이 max변수 값으로 저장
        /*int max = arr[0]; // . 배열의 첫 번째 값으로 최대값을 초기화 한다
        for(int i=1; i< arr.length;i++) { // . 배열의 두 번째 값부터 비교한다
            if(arr[i] > max)
                max = arr[i];
        }
        */

        //2번 방법 : 받은 배열을 Arrays.sort()메서드를 이용해서 오름차순으로 정렬
        Arrays.sort(arr);
        //배열의 맨 마지막 위치 즉 length-1인 위치가 최대값
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));
        System.out.println("최대값:" + max(new int[]{}));
    }
}
