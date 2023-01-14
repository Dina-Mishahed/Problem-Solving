class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      ArrayList<Integer> list = new ArrayList<>( );
      ArrayList<Integer> intersection = new ArrayList<>();
      for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
      Collections.sort(list);
        
      for (int i = 0; i < nums2.length; i++) {
            if (list.indexOf(nums2[i]) != -1) {
                intersection.add(nums2[i]);
                list.remove(list.indexOf(nums2[i]));
            }
        }
        
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        
        return result;
    }
}