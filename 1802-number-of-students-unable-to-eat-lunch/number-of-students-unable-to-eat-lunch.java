class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer>queue = new LinkedList<>();
        for(int i=0;i<students.length;i++)
        {
            queue.offer(students[i]);
        }
        int index=0;
        int count=0;
        while(!queue.isEmpty() && count<queue.size())
        {
            if(queue.peek()==sandwiches[index])
            {
                count=0;
                index++;
                queue.poll();
            }
            else
            {
                count++;
                queue.offer(queue.poll());
            }
        }
        return queue.size();

    }
}