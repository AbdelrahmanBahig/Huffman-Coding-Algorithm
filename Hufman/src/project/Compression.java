package project;

public class Compression {

    Node root = new Node("" , 0 , 100);
    Node current = root;
    Tree t = new Tree();

    public String encode(String input)
    {
        for(int i=0 ; i<input.length() ; i++)
        {
            t.getNode(input.charAt(i) , root);
            Node get = t.get();
            t.updateTree(input.charAt(i) , get , root , true);
        }
        return t.getResult();
    }

}
