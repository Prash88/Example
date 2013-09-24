import java.util.ArrayList;


public class BinarySearchTree {

	TreeNode root;
	BinarySearchTree(){
        this.root = null;
    }
    
	public void insert(TreeNode t,int z){
	
		if(t == null)
		{
			return;
		}
		if(t.value > z)
		{
			if(t.left != null)
				insert(t.left,z);
			else
				t.left = new TreeNode(z);
		}
		else
		{
			if(t.right != null)
				insert(t.right,z);
			else
				t.right = new TreeNode(z);
		}
    }

	public void inorder(TreeNode t){
		
		if(t == null)
		{
			return;
		}
		inorder(t.left);
		System.out.println(t.value);
		inorder(t.right);
		
    }
	
	public int sumNodes (TreeNode t){
		
		int left = 0;
		int right = 0;
		if(t == null)
		{
			return 0;
		}
		if(t.left == null && t.right == null)
		{
			return t.value;
		}
		if(t.left != null)
		{
			left = sumNodes(t.left);
		}		
		if(t.right != null)
		{
			right = sumNodes(t.right);
		}
		return (t.value + left + right);
    }
	
	public int countNodes (TreeNode t){
		if(t == null)
		{
			return 0;
		}
		return countNodes(t.left)+countNodes(t.right)+1;
	}
	
	public int maxHeight(TreeNode t)
	{
		if(t == null)
		{
			return 0;
		}
		return Math.max(maxHeight(t.left),maxHeight(t.right))+1;
	}
	
	public int minHeight(TreeNode t)
	{
		if(t == null)
		{
			return 0;
		}
		return Math.min(maxHeight(t.left),maxHeight(t.right))+1;
	}
	public double avg (TreeNode t){
		int count = countNodes(t);
		int sum = sumNodes(t);
		return (sum/count);		
	}
	
	public void printAll(TreeNode node,ArrayList<Integer> path) 
	{
	    if(node==null)
	    {
	        return;
	    }
	    path.add(node.value);

	    if(node.left==null && node.right==null)
	    {
	        System.out.println(path);
	        return;
	    }
	    else
	    {
	        printAll(node.left,new ArrayList<Integer>(path));
	        printAll(node.right,new ArrayList<Integer>(path));
	    }      
	}

	public static void main(String args[])
	{
		BinarySearchTree b = new BinarySearchTree();
		b.root = new TreeNode(50);
		b.insert(b.root,20);
		b.insert(b.root, 30);
		b.insert(b.root, 30);
		b.insert(b.root, 70);
		b.insert(b.root, 80);
		b.insert(b.root, 65);
		b.inorder(b.root);
		System.out.println(b.sumNodes(b.root));
		System.out.println(b.countNodes(b.root));
		System.out.println(b.avg(b.root));
		System.out.println(b.maxHeight(b.root));
		System.out.println(b.minHeight(b.root));
		b.printAll(b.root, new ArrayList<Integer>());
	}

}

class TreeNode {
	TreeNode   right;
	TreeNode   left;
    int value;
    TreeNode (int value ) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}