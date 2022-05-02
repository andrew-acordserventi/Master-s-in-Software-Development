package week3;
// make sure all files in nodeTrees package are accessible
// some files in nodeTrees may need files from net.datastructures

import week3.nodeTrees.IntBST;

import static week3.nodeTrees.IntBST.makeBinaryTree;

public class Hw3_p7 {

	public static void main(String[] args) {

		IntBST t = new IntBST();
		
		int[] a1 = {10};
		int[] a2 = {10, 20, 30};
		int[] a3 = {10, 20, 30, 40, 50, 60, 70};
		int[] a4 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150};
		
		t = makeBinaryTree(a4); // test with other arrays too
		System.out.println("Tree size: " + t.size());
		System.out.println("Tree height: " + t.height(t.root));
		System.out.println("");
		
		t.print(t.root);

	}
}
/**
 Test case:

 Tree size: 15
 Tree height: 3

 			|-- 150
 		|-- 140
 			|-- 130
 	|-- 120
 			|-- 110
 		|-- 100
 			|-- 90
 |-- 80
 			|-- 70
 		|-- 60
 			|-- 50
 	|-- 40
 			|-- 30
 		|-- 20
 			|-- 10

 Process finished with exit code 0
 */