/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



class TreeNode {
    int id;
    String name;
    LinkedList<TreeNode> children;
    LinkedList<Item> items;

    public TreeNode(int id, String name) {
        this.id = id;
        this.name = name;
        children = new LinkedList<>();
        items = new LinkedList<>();
    }
}
