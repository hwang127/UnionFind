import java.util.ArrayList;

public class UnionFind {
    int [] size;//size of the tree for each root.
    int [] tree;//parent node of each node.


    UnionFind(int n)
    {

        for (int i=0;i<n;i++)
        {
            tree[i]= i;
            size[i]=1;
        }


    }
    public int root(int n)
    {
       int i=n;
       while (i!=tree[i]) i=tree[tree[i]];//This will cut the loop number by half.

       return i;
    }
    public void union(int p, int q)
    {
        int r1=root(p);
        int r2=root(q);
        if (r1!=r2)
        {
            if (size[r1] > size[r2]) {
                tree[r2] = r1;//set the parent of the root of smaller tree to be the root of larger tree.
                size[r1] += size[r2];//update the size of larger tree.
            } else {
                tree[r1] = r2;
                size[r2] += size[r1];
            }
        }
    }
    public boolean connected(int p, int q)
    {
        return root(p)==root(q);
    }

}
