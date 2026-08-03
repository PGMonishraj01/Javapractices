class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        int n = strs.length;
        List<List<String>> list = new ArrayList<>();

        boolean[] visited = new boolean[n];

        // Sort each string only once
        String[] sorted = new String[n];

        for (int i = 0; i < n; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            sorted[i] = new String(ch);
        }

        for (int i = 0; i < n; i++) {

            if (visited[i])
                continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < n; j++) {

                if (visited[j])
                    continue;

                if (sorted[i].equals(sorted[j])) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            list.add(group);
        }

        return list;
    }
}
