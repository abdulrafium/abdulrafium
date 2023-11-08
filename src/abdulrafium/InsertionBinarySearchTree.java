package abdulrafium;
class Node{
	
	int data;
	Node left;
	Node right;
	
	Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class InsertionBinarySearchTree {

	Node root;
	
	public Node AddBinary(Node root, int data)
	{
		if(root==null)
		{
			root=new Node(data);
		}
		
		else
		{
			if(data<root.data)
			{
				root.left=AddBinary(root.left,data);
			}
			
			else if(data>root.data)
			{
				root.right=AddBinary(root.right,data);
			}
			//return ;
		}
		//return root;
		return root;
		
		
	}
	
	public void Add(int data)		//Helper Method
	{
	    root = AddBinary(root, data);
	}
	
	public void PreOrder(Node root)
	{
		if(root!=null)
		{
			
			PreOrder(root.left);
			System.out.print(root.data+ " ");
			PreOrder(root.right);
			
		}
		
		return;
	}
	
	public int Height(Node root)
	{
		if(root==null)
		{
			return 0;
		}

		return 1+Math.max(Height(root.left), Height(root.right));
	}
	
	public boolean Search(Node root,int d)
	{
		if(root==null)
		{
			return false;
		}
		
		if(root.data==d)
		{
			return true;
		}
		boolean Left=Search(root.left,d);
		boolean right=Search(root.right,d);
		return Left || right;
	}

	public static void main(String[] args) {
		
		InsertionBinarySearchTree obj=new InsertionBinarySearchTree();
		
		obj.Add(10);
		obj.Add(5);
		obj.Add(16);
		obj.Add(4);
		obj.Add(6);
		obj.Add(15);
		obj.Add(18);
		
		obj.PreOrder(obj.root);
		
		System.out.println();
		System.out.println("Height: " + obj.Height(obj.root));
		
		if(obj.Search(obj.root, 18))
		{
			System.out.println("Found");
		}
		
		else
		{
			System.out.println("Not Found");
		}

	}

}
