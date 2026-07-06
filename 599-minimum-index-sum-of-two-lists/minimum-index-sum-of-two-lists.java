class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();

        int m = list1.length;
        int n = list2.length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (list1[i].equals(list2[j])) {
                    l1.add(i + j);
                    l2.add(list1[i]);
                    break;
                }
            }
        }

        int min = l1.get(0);

        for (int i = 1; i < l1.size(); i++) {
            if (l1.get(i) < min) {
                min = l1.get(i);
            }
        }

        for (int i = 0; i < l2.size(); i++) {
            if (l1.get(i) == min) {
                ans.add(l2.get(i));
            }
        }

        String[] answer = new String[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        return answer;
    }
}