// L2196 - Binary Tree 
// Leetcode daily challenge

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> children = new HashSet<>();

        for (int[] arr : descriptions) {
            int parent = arr[0], child = arr[1], isLeft = arr[2];

            children.add(child);
            TreeNode parentNode = map.getOrDefault(parent, new TreeNode(parent));
            TreeNode childNode = map.getOrDefault(child, new TreeNode(child));

            if (isLeft == 1) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }

            map.put(parent, parentNode);
            map.put(child, childNode);
        }

        // Find the root node (a node that is never a child)
        int rootVal = -1;
        for (int[] arr : descriptions) {
            int parent = arr[0];
            if (!children.contains(parent)) {
                rootVal = parent;
                break;
            }
        }

        return map.get(rootVal);
    }
}
