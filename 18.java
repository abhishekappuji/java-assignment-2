import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Queue_reverse {
static Queue<Integer> queue;
static void Print()
{
while (!queue.isEmpty())
{
System.out.print(queue.peek() + " ");
queue.remove();
}
}
static Queue<Integer> reverseQueue(Queue<Integer> q)
{
if (q.isEmpty())
return q;
int data = q.peek();
q.remove();
q = reverseQueue(q);
q.add(data);
return q;
}
public static void main(String args[])
{
queue = new LinkedList<Integer>();
queue.add(56);
queue.add(127);
queue.add(130);
queue.add(245);
queue.add(285);
queue.add(392);
queue.add(548);
queue.add(580);
queue.add(590);
queue.add(1000);
queue = reverseQueue(queue);
Print();
}
}
