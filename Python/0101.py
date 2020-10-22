def isMirror(root1, root2):

             if root1 is None and root2 is None:
                return True

             if (root1 is not None and root2 is not None):
                if root1.val == root2.val:
                    return (isMirror(root1.left, root2.right) and isMirror(root1.right, root2.left))

             return False

class Solution:

    
     def isSymmetric(self, root: TreeNode) -> bool:
         return isMirror(root, root)
