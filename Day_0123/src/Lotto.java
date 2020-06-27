import java.util.*;

public class Lotto {

    public static void main(String[] args) {

        HashMap<Integer, Set<Integer>> lottoList = new HashMap<>();
        int num = 45;
        int max = 100;
        for ( int i=1; i<=max; i++) {
            Set<Integer> lotto = new TreeSet<>();
            do {
                lotto.add(ranNum(num));
            } while (lotto.size() < 7);
            lottoList.put(i,lotto);
            System.out.println( i+ "회차 : " + lottoList.get(i));
        }

        HashMap<Integer, Integer> lottoCnt = new HashMap<>();
        for ( int i=1; i<=num; i++ ){
            lottoCnt.put(i, cntNum(lottoList, i));
        }

    }

    public static int ranNum(int num){
        return (int)(Math.random()*num)+1;
    }

    public static int cntNum(HashMap<Integer, Set<Integer>> lottoList, int idx){
        int cnt=0;
        for( Integer key : lottoList.keySet() ){
            Iterator<Integer> it = lottoList.get(key).iterator();
            while(it.hasNext()){
                if ( it.next() == idx ) cnt++;
            }
        }
        System.out.println("번호 "+ idx + " : " +cnt);
        return cnt;
    }

}