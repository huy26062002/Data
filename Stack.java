public class Stack<E> {
    private Node<E> top;
    private int size;

    private static class Node<E> {
        private E element;
        private Node<E> previous;

        public Node(E element){
            this.element = element;
        }
    }

    public void push(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.previous = top;
        top = newNode;
        this.size++;
    }

    public E pop() {
        E element = this.top.element;
        Node<E> cache = this.top.previous; 
        this.top.previous = null; 
        this.top = cache; 
        this.size--;
        return element;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void printAllElements() {
        if (this.isEmpty()){
            System.out.println("\nThe message is empty");
            System.exit(0);
        }
        Node<E> current = top;
        while (true) {
            System.out.print(current.element + " ");
            current = current.previous;
             if (current == null)
                break;
        }
         System.out.println();
    }
}
