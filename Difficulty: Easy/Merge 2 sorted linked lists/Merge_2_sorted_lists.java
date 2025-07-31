/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // Create a dummy node to act as the head of the new list.
        // This simplifies the logic of handling the first node.
        Node dummy = new Node(-1);
        
        // Use a 'current' pointer to build the merged list.
        Node current = dummy;
        
        // Loop while both lists have nodes to compare.
        while (head1 != null && head2 != null) {
            // Compare the data of the current nodes in both lists.
            if (head1.data <= head2.data) {
                // If head1's data is smaller, append head1's node to the merged list.
                current.next = head1;
                // Move head1 to the next node.
                head1 = head1.next;
            } else {
                // If head2's data is smaller, append head2's node.
                current.next = head2;
                // Move head2 to the next node.
                head2 = head2.next;
            }
            // Move the 'current' pointer forward to the newly added node.
            current = current.next;
        }
        
        // After the loop, one of the lists might still have remaining nodes.
        // Append the rest of the non-null list directly.
        // This single line handles both cases because one of them will be null.
        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }
        
        // Return the merged list, which starts from the node after the dummy node.
        return dummy.next;
    }
}