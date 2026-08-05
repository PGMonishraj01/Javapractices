class Solution {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        call(n, k, 1, ans);
        return list;
    }
    private void call(int n, int k, int index, List<Integer> ans) {
        if (ans.size() == k) {
            list.add(new ArrayList<>(ans));
            return ;
        }
        for (int i = index; i <= n; i++) {
            ans.add(i);
            call(n, k, i + 1, ans);
            ans.remove(ans.size() - 1);
        }
    }
}
