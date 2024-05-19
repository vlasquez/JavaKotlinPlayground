import java.util.HashMap;

public class LeetCode {
    public static void main(String [] args)
    {
        ListNode l1 = new ListNode(1, new ListNode(2,new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3,new ListNode(4)));
        Solution solution = new Solution();
        System.out.println(solution.mergeTwoLists(l1,l2));
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        HashMap<String,Integer> as = new HashMap<>();
        if(l1 == null) return l2;
        if(l2==null) return l1;

        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }
        else{
            l2.next = mergeTwoLists(l2.next,l1);
            return l2;        }
    }


}



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }