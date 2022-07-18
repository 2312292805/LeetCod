package Mat6;


import javax.swing.tree.TreeNode;
import java.util.Enumeration;
import java.util.HashMap;

public class EX3 {
    public TreeNode createBinaryTree(int[][] descriptions) {
        // 哈希表用于记录已存在的值和对应的节点（因为node的值是唯一的）
        HashMap<Integer, TreeNode> map = new HashMap();
        int[] visited = new int[100001];
        for (int i = 0; i < descriptions.length; i++) {
            // 将node存在map中
            if (!map.containsKey(descriptions[i][0])) {
                TreeNode node = new TreeNode(descriptions[i][0]) {
                    @Override
                    public TreeNode getChildAt(int childIndex) {
                        return null;
                    }

                    @Override
                    public int getChildCount() {
                        return 0;
                    }

                    @Override
                    public TreeNode getParent() {
                        return null;
                    }

                    @Override
                    public int getIndex(TreeNode node) {
                        return 0;
                    }

                    @Override
                    public boolean getAllowsChildren() {
                        return false;
                    }

                    @Override
                    public boolean isLeaf() {
                        return false;
                    }

                    @Override
                    public Enumeration children() {
                        return null;
                    }
                };
                map.put(descriptions[i][0], node);
            }
            if (!map.containsKey(descriptions[i][1])) {
                TreeNode node = new TreeNode(descriptions[i][1]);
                map.put(descriptions[i][1], node);
            }
            // 建立关系
            TreeNode root = map.get(descriptions[i][0]);
            TreeNode child = map.get(descriptions[i][1]);
            // 如果该节点是儿子，记录下来
            visited[descriptions[i][1]] = 1;
            if (descriptions[i][2] == 1) {
                root.left = child;
            } else {
                root.right = child;
            }
        }
        TreeNode head = new TreeNode();
        for (Integer i : map.keySet()) {
            // 找到那个不是儿子的爹，它就是二叉树的根
            if (visited[i] == 0) {
                head = map.get(i);
                return head;
            }
        }
        return head;
    }
}
