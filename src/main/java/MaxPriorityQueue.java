public class MaxPriorityQueue {

    private Job[] arr;
    private int current = -1;

    public MaxPriorityQueue() {
        arr = new Job[10];
    }

    public int capacity() {
        return arr.length;
    }

    public int size() {
        return current + 1;
    }

    public boolean isEmpty() {
        return current == -1;
    }

    // O(log n)
    public void insert(Job job) {

        if (size() == capacity()) {
            resize();
        }

        arr[++current] = job;
        heapifyUp(current);
    }

    // O(log n)
    public Job extractMax() {

        if (isEmpty())
            throw new RuntimeException("Priority Queue is Empty");

        Job max = arr[0];

        arr[0] = arr[current];
        arr[current] = null;
        current--;

        if (!isEmpty())
            heapifyDown(0);

        return max;
    }

    // O(1)
    public Job getMax() {

        if (isEmpty())
            throw new RuntimeException("Priority Queue is Empty");

        return arr[0];
    }

    // O(1)
    public int getPriority(int index) {

        if (index < 0 || index > current)
            throw new RuntimeException("Invalid Index");

        return arr[index].priority;
    }

    // -----------------------
    // Private Helper Methods
    // -----------------------

    private void resize() {

        Job[] temp = new Job[arr.length * 2];

        for (int i = 0; i <= current; i++)
            temp[i] = arr[i];

        arr = temp;
    }

    private void heapifyUp(int index) {

        while (index > 0) {

            int parent = (index - 1) / 2;

            if (arr[parent].priority >= arr[index].priority)
                break;

            swap(parent, index);

            index = parent;
        }
    }

    private void heapifyDown(int index) {

        while (true) {

            int left = 2 * index + 1;
            int right = 2 * index + 2;

            int largest = index;

            if (left <= current &&
                    arr[left].priority > arr[largest].priority) {

                largest = left;
            }

            if (right <= current &&
                    arr[right].priority > arr[largest].priority) {

                largest = right;
            }

            if (largest == index)
                break;

            swap(index, largest);

            index = largest;
        }
    }

    private void swap(int i, int j) {

        Job temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
