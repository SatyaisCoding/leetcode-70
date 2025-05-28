// 1st Mehtod  
 // This solution is the very bruite force approach  : ->
   
 //  in this method , we traverse the array from front and from the last also 
 //  then checking if the ith and jth element is same or not 
 //  if same returning true else false
   
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}


// 2nd Method : -> 
// Approach  : -> 
//     Sort the array 
//     traverse , and check i and i+1th elem
//     if same , return true otherwise false;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
        
    }
}
 // 3rd Method  :

 // Approach  : 
 //   in this approach , we are usning set 
 //   firstly , all the element is damping into Set , 
 //   and then comparing the size of both Set and Array 
 //   if the size of the array is greater than the Set ,
 //   then duplicate exixts, otherwise not 

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        return numSet.size() < nums.length;
    }
}
