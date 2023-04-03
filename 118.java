class Solution {
    public List<List<Integer>> generate(int numRows) {
        
				List<List<Integer>> li = new ArrayList<>();
				List<Integer> prev=null;

				for(int i=1; i<=numRows; i++){
					List<Integer> curr=new ArrayList<>();

					for(int j=0; j<i; j++){
							if(j==0 || j==i-1)
							curr.add(1);

							else
							curr.add(prev.get(j-1)+prev.get(j));

					}
					li.add(curr);
					prev=curr;
				}
					return li;
    }
	
}
