class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (visited[i])
                continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {

                if (!visited[j] && anagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            res.add(group);
        }

        return res;
    }

    private boolean anagram(String a, String b) {

        if (a.length() != b.length())
            return false;

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }

        return true;
    }
}
