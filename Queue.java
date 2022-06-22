public class Queue<E> {
    private Node<E> head;
    private int size;

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element){
            this.element = element;
        }
    }
    
    public void offer(E element) {
        Node<E> newNode = new Node<E>(element);
        if(this.head == null) {
            this.head = newNode;
        }else {
            Node<E> current = this.head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        this.size++;
    }

    public E poll() {
        E element = this.head.element;
        if(this.size == 1){
            this.head = null;
        } else{
            Node<E> next = this.head.next;
            this.head.next = null;
            this.head = next;
        }
        this.size--;
        return element;
    }

    public boolean isEmpty() {
        return this.size==0;
    }

    public void printAllElements() {
        if (this.isEmpty()){
            System.out.println("\nThe message is empty");
            System.exit(0);
        }
        Node<E> current = head;
        while (true) {
            System.out.print(current.element + " ");
            current = current.next;
            if (current == null)
                break;
        }
        System.out.println();
    }
}
