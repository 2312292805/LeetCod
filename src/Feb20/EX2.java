package Feb20;

public class EX2 {
    public class ListNode{
        public Integer data;
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
    public ListNode mergeNodes(ListNode head) {
        int count=0;
        while(head!=null){
            head=head.next;
            count+=(int)head;
        }
        if(head.data.equals(0)){

        }
    }
}
