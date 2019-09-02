import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main
{
    public static void main(String [] args) throws FileNotFoundException
    {
        File file=new File ("input.txt");
        Scanner scanner =new Scanner(file);
        int total=scanner.nextInt();
        UnionFind uf=new UnionFind(total);
        while (scanner.hasNextInt())
        {
            int p=scanner.nextInt();
            int q=scanner.nextInt();
            if(! uf.connected(p,q))
            {
                uf.union(p,q);
                System.out.println(p+" "+ q);

            }
        }

    }
}

