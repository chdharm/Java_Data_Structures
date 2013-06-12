package trees;

public class Trees {

    public static void main(String[] args) {
        BST bst = new BST();
        System.out.print("Adding the following to the BST: ");
        bst.add(5);
        bst.add(3);
        bst.add(7);
        bst.add(2);
        bst.add(4);
//        bst.add(6);
        bst.add(8);
//        for(int i =0;i<15;i++){
//            int number = (int)Math.round(Math.random()*100);
//            bst.add(number);
//            System.out.print(number+" ");
//        }
        System.out.println("\n");
        bst.traverseDFSpreorder();
        bst.traverseDFSinorder();
        bst.traverseDFSpostorder();
        bst.traverseBFS();
        System.out.println("Max value = "+ bst.findMax());
        System.out.println("Min value = "+ bst.findMin());
        System.out.println("Value 23 is present: "+ bst.find(23));
        
        System.out.println("Delete Successful? "+bst.delete(7));
        bst.traverseBFS();
    }
}
