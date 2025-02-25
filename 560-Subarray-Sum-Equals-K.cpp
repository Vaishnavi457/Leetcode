class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
    unordered_map<int,int>sSum;
    int sum=0,count=0;
    sSum[0]=1;
    for(int num:nums){
    sum+=num;
    if(sSum.find(sum-k)!=sSum.end()){
        count+=sSum[sum-k];
    }  
    sSum[sum]++;
    }
    return count;
    }
};