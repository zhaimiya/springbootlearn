package vi.test.BTree;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

//        int pre[] = {1, 2, 4, 7, 3, 5, 6, 8};
//        int in[] = {4, 7, 2, 1, 5, 3, 8, 6};
//        TreeNode tree = solution.reConstructBinaryTree(pre,in);

        int array[] = {3,4,5,1,2};
        int min = solution.minNumberInRotateArray(array);
        System.out.println(min);
    }
}
