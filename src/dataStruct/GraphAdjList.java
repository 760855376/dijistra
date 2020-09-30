
	package dataStruct;

	import java.util.Scanner;

	/**
	 * �ڽӱ�_����ͼ������ͼ����Ȩͼʵ��ʵ��
	 */
	public class GraphAdjList {
	    private static final int MAXSIZE = 100;//Ĭ����󶥵����Ϊ100
	    private int numVertexes;//�������
	    private int numEdges;//����
	    public boolean flag;//����Ƿ�Ϊ����ͼ,java�����Ĭ�ϳ�ʼ��Ϊtrue

	    public VertexNode[] adjList;

	    /**
	     * ������
	     * @param numVertexes �������
	     * @param numEdges ����
	     */
	    public GraphAdjList(int numVertexes,int numEdges,boolean flag) {
	        this.numVertexes = numVertexes;
	        this.numEdges = numEdges;
	        this.flag = flag;
	        adjList = new VertexNode[MAXSIZE];//Ϊ�˺���Ĳ���
	    }
	    public void CreateALGraph(){
	        Scanner input = new Scanner(System.in);
	        String info = "����ͼ";
	        if(!flag)
	            info = "����ͼ";
	        System.out.println("����"+info+"�����������"+this.numVertexes+"������"+this.numEdges);
	        System.out.println("��ʼ���붥����Ϣ��");
	        for(int i=0;i<this.numVertexes;i++){
	            int data = input.nextInt();
	            this.adjList[i] = new VertexNode(data,null);
	        }
	        System.out.println("��ʼ����ߣ�vi��vj���Ķ�����źͱ��ϵ�Ȩֵw��");
	        for(int k=0;k<this.numEdges;k++){
	            int i=input.nextInt();
	            int j=input.nextInt();//1 3 2,1 2 4
	            int weight = input.nextInt();

	            EdgeNode e = new EdgeNode(j, weight);
	            e.next = this.adjList[i].firstEdge;//ͷ�巨,e�ڵ�ָ��ԭ��ͷ���ָ��ĵ�ַ
	            this.adjList[i].firstEdge = e;//���ӣ�

	            if(flag){//���������ͼ
	                e = new EdgeNode(i,weight);
	                e.next = this.adjList[j].firstEdge;
	                this.adjList[j].firstEdge = e;
	            }
	        }
	        System.out.println("������ɣ�");
	    }
	    public void displayALGraph(){
	        for(int i=0;i<this.numVertexes;i++){
	            if(adjList[i].firstEdge!=null){
	                EdgeNode e = adjList[i].firstEdge;
	                while(e!=null){
	                    System.out.print("���㣺"+this.adjList[i].data+"�ڽӶ��㣺");//��ӡ������Ϣ
	                    System.out.println(e.adjvex+"Ȩֵ��"+e.weight);//��ӡ�ö������ڽӶ�����Ϣ
	                    e = e.next;
	                }
	            }
	        }
	    }
	    

	    public static void main(String[]args){
	        GraphAdjList myGraph = new GraphAdjList(5,6,false);//����5����6�ߵ�����ͼ
	        myGraph.CreateALGraph();
	        myGraph.displayALGraph();
	    }
	


}
