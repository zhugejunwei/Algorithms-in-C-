public class Solution {
    public static String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList();
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i;
            nums.add(i);
        }
        k--;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i<= n; i++) {
            int idx = k / fact[n - i];
            sb.append(nums.get(idx));
            nums.remove(idx);
            k -= idx * fact[n - i];
        }
        return sb.toString();
    }
}
