public class TwoSums
{
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<Integer>();
        Integer result = null;
        for (int i = 0; i < nums.length; i++) {
            list.add(i,nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            result = target - list.get(i);
            if( i  == list.lastIndexOf(new Integer(result))) {
                for (int j = i+1; j < list.size(); j++) {
                    result = target - list.get(j);
                    if(list.contains(new Integer(result))) {
                        return new int[]{j,list.indexOf(new Integer(result))};
                    }
                    return null;
                }
                return null;
            }else {
                return new int[]{i, list.lastIndexOf(new Integer(result))};
            }
        }
        return null;
    }