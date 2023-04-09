public class Minmax {
    //  最大値の取得
    public int max(int n1, int n2, int n3) {
        if (n1 >= n2 && n1 >= n3) { // n1が最大値の場合
            return n1;
        } else if (n2 >= n1 && n2 >= n3) { // n2が最大値の場合
            return n2;
        }
        return n3; // n3が最大値の場合
    }

    //  最小値の取得
    public int min(int n1, int n2, int n3) {
        if (n1 <= n2 && n1 <= n3) { // n1が最小値の場合
            return n1;
        } else if (n2 <= n1 && n2 <= n3) { // n2が最小値の場合
            return n2;
        }
        return n3; // n3が最小値の場合
    }
}
