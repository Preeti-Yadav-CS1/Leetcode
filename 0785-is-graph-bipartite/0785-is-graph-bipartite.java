class Solution {
    public boolean isBipartite(int[][] graph) {
        HashMap<Integer, Integer> visited= new HashMap<>();
        Queue<bipartitePair> queue= new LinkedList<>();
        for(int src=0; src<graph.length; src++){ 
            if(visited.containsKey(src)){
                continue;
            }
            queue.add(new bipartitePair(src,0));
            while(!queue.isEmpty()){
                // 1. remove from queue
                bipartitePair remove= queue.poll();
                // 2. Aready visited then ignore
                if(visited.containsKey(remove.vertex)){
                    if(visited.get(remove.vertex)!=remove.distance)
                        return false;
                    else
                        continue;
                }
                // 3. visited
                visited.put(remove.vertex, remove.distance);
                //add unvisited neighbour
                for(int neighbour: graph[remove.vertex]){
                    if(!visited.containsKey(neighbour)){
                        queue.add(new bipartitePair(neighbour, remove.distance+1));
                    }
                }
            } 
        }
        return true;
    }
    class bipartitePair{
        int vertex;
        int distance;
        public bipartitePair(int src, int distance){
            this.vertex= src;
            this.distance= distance;
        }
    }
}