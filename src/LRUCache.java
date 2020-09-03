import java.util.HashMap;

public class LRUCache {
    static class Node{
        private int key,val;
        public Node next,prev;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    static class DoubleList{
        private Node head=null;
        private Node tail=null;

        //链表头部添加节点x，时间O(1)
        public void addNode(Node newNode){
            if (newNode == null) {
                return;
            }
            if (this.head == null) {
                this.head = newNode;
                this.tail = newNode;
            } else {
                this.tail.next = newNode;
                newNode.prev = this.tail;
                this.tail = newNode;
            }
        }
        public void remove(Node node){
            if (this.tail == node&&this.head==node) {
                this.tail=null;
                this.head=null;
            }else if (this.tail == node){
                this.tail=this.tail.prev;
                this.tail.next=null;

            }else if (this.head==node){
                this.head=this.head.next;
                this.head.prev=null;
            }else {
                node.prev.next=node.next;
                node.next.prev=node.prev;
            }
        }
        public Node removeHead(){
            if (this.head == null) {
                return null;
            }
            Node res = this.head;
            if (this.head == this.tail) {
                this.head = null;
                this.tail = null;
            } else {
                this.head = res.next;
                res.next = null;
                this.head.prev = null;
            }
            return res;
        }

        public void moveNodeToTail(Node node) {
            if (this.tail == node) {
                return;
            }
            if (this.head == node) {
                this.head = node.next;
                this.head.prev = null;
            } else {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }
            node.prev = this.tail;
            node.next = null;
            this.tail.next = node;
            this.tail = node;
        }
    }
    private HashMap<Integer,Node> map;
    private DoubleList cache;
    private int capacity;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        cache=new DoubleList();
    }
    
    public int get(int key) {
        if (!map.containsKey(key)){
            return -1;
        }
        int val = map.get(key).val;
        put(key,val);
        return val;
    }
    
    public void put(int key, int value) {
        Node x=new Node(key,value);
        if (map.containsKey(key)){
            //删除旧的节点，新的插到头部
            cache.remove(map.get(key));
            cache.addNode(x);
            map.put(key,x);
        }else {
            //满了，删除链表最后一个数据
            if (capacity==map.size()){
                Node node = cache.removeHead();
                map.remove(node.key);
            }
            cache.addNode(x);
            map.put(key,x);
        }
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
