
public class LinkedList {

    private Node currentNode;

    public LinkedList(int nodeValue){
        Node element = new Node(nodeValue, null, null);
        element.setRoot(true);
        currentNode = element;
    }

    public Node getCurrentNode(){
        return currentNode;
    }

    public void moveLeft(){
        currentNode = currentNode.getLeft();
    }

    public void moveRight(){
        currentNode = currentNode.getRight();
    }

    public void addStart(int nodeValue){
        Node leftNode = currentNode;
        while(!leftNode.getRoot()){
            leftNode = leftNode.getLeft();
        }
        Node newElement = new Node(nodeValue, null, leftNode);
        newElement.setRoot(true);
        leftNode.setRoot(false);
        leftNode.setLeft(newElement);
    }

    public void addEnd(int nodeValue){
        Node RightNode = currentNode;
        while(RightNode.getRight()!= null){
            RightNode = RightNode.getRight();
        }
        Node newElement = new Node(nodeValue, RightNode, null);
        RightNode.setRight(newElement);
    }

    public void removeNode(){
        Node left = currentNode.getLeft();
        Node right = currentNode.getRight();
        if(right!=null) {
            right.setLeft(left);
            currentNode = right;
        }
        if(left!=null) {
            left.setRight(right);
            currentNode = left;
        }
    }



}
