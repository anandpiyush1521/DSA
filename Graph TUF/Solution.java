import java.util.*;
class Node 
{
    int first;
    int second;
    int third;

    Node(int _first,int _second,int _third)
    {
        this.first=_first;
        this.second=_second;
        this.third=_third;
    }
}
class Solution 
{
    public int[][] updateMatrix(int[][] mat) 
    {
        int n=mat.length;
        int m=mat[0].length;
        int vis[][]=new int[n][m];//to store whether the element is visited or not
        int dist[][]=new int[n][m];// to store the distance needed to travel
        Queue<Node> q=new LinkedList<Node>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)//if element is equal to 0
                {
                    q.add(new Node(i,j,1));//1 step
                    vis[i][j]=0;//visited
                }
                else
                {
                    vis[i][j]=1;//unvisited
                }
            }
        }

        int delrow[]={-1,0,+1,0};//4 directions
        int delcol[]={0,+1,0,-1};//4 directions

        while(!q.isEmpty())//if queue is not empty then traverse
        {
            int row=q.peek().first;//first pair is row
            int col=q.peek().second;//second pair is column
            int steps=q.peek().third;//third pair is steps
            q.remove();//go out of queue
            dist[row][col]=steps-1;//the distance which it took to reach

            for(int i=0;i<4;i++)//for fourn directions
            {
                int nrow=row + delrow[i];//neighbour row
                int ncol=col + delcol[i];//neighbour colum 
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==1)//valid neighbour row and column and already visited
                {
                    vis[nrow][ncol]=0;//now visited
                    q.add(new Node(nrow,ncol,steps+1));//save the value and increment the steps 

                }
            }
        }
        return dist;//returning the dist array
    }
    public static void main(String[] args){
        int[][] mat = {
            {0,0,0},
            {0,1,0},
            {0,0,0}
        };
        Solution obj = new Solution();
        int[][] ans = obj.updateMatrix(mat);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++){
                System.out.print(ans[i][j] + " "); 
            }
            System.out.println();
        }
    }
}