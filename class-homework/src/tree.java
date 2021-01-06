public class tree {
    private int minSum;
    private node minRoot;
    public node findSubtree(node root)
    {
        minSum=Integer.MAX_VALUE;
        minRoot=null;
        getSum(root);
        return minRoot;
    }
    private int getSum(node root)
    {
        if(root==null)
            return 0;
        int sum=getSum(root.left)+getSum(root.right)+root.value;
        if(sum<minSum)
        {
            minSum=sum;
            minRoot=root;
        }
        return sum;
    }
}
