package first_java;
import java.util.*;
public class SlidingWindowMaximum {
        public int[] maxSlidingWindow(int[] arr, int k) {
            int n = arr.length;
            int[] ans = new int[n-k+1]; // no. of window = n-k+1
            // Deque is used instead of queue because we needed to remove the element from last or back side.
            Deque<Integer> deque = new LinkedList<>();

            int start=0,end=0,max=0;

            while(end<n){
                // here before adding the current element of the array in the deque,
                // we remove all the elements from the deque which are less than the curr elements
                // because the elements smaller than the curr are of no use for us
                // Therefore we maintain the max element at the front of the deque.
                while(!deque.isEmpty() && deque.getLast()<arr[end]){
                    deque.removeLast();
                }

                deque.addLast(arr[end]); // when all the elements smaller than curr are removed,
                // then the curr element is added in the deque from the last.

                if(end-start+1 < k) end++; // moving the end(e) till the window size (k) is reached.
                else if(end-start+1 == k){
                    ans[max] = deque.getFirst(); // will give the max element of the current window.
                    // Here we clear the previous window's first element if it is present.
                    if(deque.getFirst() == arr[start]) deque.removeFirst();

                    max++;
                    start++;
                    end++;
                }
            }

            return ans;
        }

        public static void main(String a[]){
            int arr[]={1,3,-1,-3,5,3,6,7};
            int k = 3;
            SlidingWindowMaximum s1 = new SlidingWindowMaximum();
            int max[]=s1.maxSlidingWindow(arr,k);
            for(int x:max){
                System.out.print(x+" ");
            }

        }
    }

