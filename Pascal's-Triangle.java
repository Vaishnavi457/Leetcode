class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> output = new ArrayList<List<Integer>>();
\t    if (numRows <= 0)  return output;
\t    ArrayList<Integer> prev = new ArrayList<Integer>();
\t    prev.add(1);
\t    output.add(prev);
\t    for (int i = 2; i <= numRows; i++) {
\t\t    ArrayList<Integer> curr = new ArrayList<Integer>();
\t\t    curr.add(1);  
\t\t    for (int j = 0; j < prev.size() - 1; j++) {
\t\t\t    curr.add(prev.get(j) + prev.get(j + 1));    
\t\t    }
\t\t    curr.add(1);  
\t\t    output.add(curr);
\t\t    prev = curr;
\t    }
\t    return output;     
    }
}