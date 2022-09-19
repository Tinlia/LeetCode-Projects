class Solution {
    public boolean containsDuplicate(int[] nums) {
      final Set<Integer> set = new HashSet<>(nums.length);
        
        for (int i : nums)
            set.add(i);
        
        return set.size() != nums.length;
    }
}
