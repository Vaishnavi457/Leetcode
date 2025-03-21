class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1, high = num;
        while(low <= high){
            long mid = low + (high - low) / 2;
            long value = mid * mid;
            if(value == num){
                return true;
            }else if(value < num){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
}