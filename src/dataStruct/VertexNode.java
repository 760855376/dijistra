package dataStruct;



 public class VertexNode{//顶点结构
    int data;//顶点信息
    EdgeNode firstEdge;//边表头指针
    public VertexNode(int data,EdgeNode firstEdge){
        this.data = data;
        this.firstEdge = firstEdge;
    }
}