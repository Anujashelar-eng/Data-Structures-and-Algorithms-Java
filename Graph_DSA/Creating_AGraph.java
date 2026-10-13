import java.util.*;

class Edge{
    int src;
    int dest;
    int w;

    Edge(int s,int d,int w){
        this.src=s;
        this.dest=d;
        this.w=w;
    }

    
}

class GraphCreating{
    public static void main(String[] args){
        int V=5;
      ArrayList<Edge> graph[]=new ArrayList[V];//Because Java does not allow generic array creation (type erasure issue). runtime generics errase

    //   for(int i=0;i<V;i++){
    //     System.out.print(graph[i]+" ");//null null null null null
    //   }
         
         for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
          //  System.out.print(graph[i]+" "); //[] [] [] [] []     that ArrayList are resizable // ArrayList objects are created inside Array on that objects we can call methods of ArrayList like .add() etc.
         }

         //0 -vertex
         graph[0].add(new Edge(0, 1, 5));
         
         //1- vertex
         graph[1].add(new Edge(1,0,5));
         graph[1].add(new Edge(1,2,1));
         graph[1].add(new Edge(1,3,3));

         //2-vertex
         graph[2].add(new Edge(2,1,1));
         graph[2].add(new Edge(2,3,1));
         graph[2].add(new Edge(2,4,1));

         //3-vertex
         graph[1].add(new Edge(3,1,3));
         graph[1].add(new Edge(3,2,1));

         //4 vertex
         graph[1].add(new Edge(4,2,2));


        //  for(int i=0;i<V;i++){
        //     System.out.print(graph[i]+" ");
        //  }

        //2's neighbors
        for(int i=0;i<graph[2].size();i++){
            Edge e= graph[2].get(i); //src,dest,wt
          //  System.out.print(e +" ");//Edge@7a81197d Edge@3f99bd52 Edge@4f023edb 
          System.out.print(e.dest+" "); //1 3 4
        }
    }
}