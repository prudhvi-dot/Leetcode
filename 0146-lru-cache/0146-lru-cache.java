class LRUCache {

    class Node {
        int key;
        int data;
        Node next;
        Node prev;

        Node(int key, int data) {
            this.key = key;
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public Node head = new Node(-1,-1);
    public Node tail = new Node(-1,-1);

    HashMap<Integer, Node> map;

    int capacity;


    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }

    public void addFront(Node node) {
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    public void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        removeNode(node);
        addFront(node);

        return node.data;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            node.data = value;
            removeNode(node);
            addFront(node);
        }
        else {
            if(map.size()==capacity) {
                Node rvNode = tail.prev;
                removeNode(rvNode);
                map.remove(rvNode.key); 
            }
                Node newNode = new Node(key,value);
                map.put(key,newNode);
                addFront(newNode);
        
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */