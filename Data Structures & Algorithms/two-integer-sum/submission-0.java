class Solution {
    public int[] twoSum(int[] nums, int target) {
        // The simple brute force solution is going to be checking every pair which has time complexity of O(n^2)
        // After thinking, I think I can use one of the features of the hashmap to bring the time O(n^2) to O(n)
        // Feature: Lookups in Hashmap takes O(1)

        Map<Integer, Integer> map = new HashMap<>();
        int i=0;
        for(int num : nums){
            if(map.containsKey(target - num)){
                return new int[] {map.get(target - num), i};
            }
            map.put(num, i);
            i++;
        }
        
        return new int[0];
        
        
    }
}
