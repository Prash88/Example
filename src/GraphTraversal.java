import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Queue;

import javax.management.Query;


public class GraphTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphNode frankfurt = new GraphNode("frankfurt");
		GraphNode mannheim = new GraphNode("mannheim");
		GraphNode wurzburg = new GraphNode("wurzburg");
		GraphNode stuttgard = new GraphNode("stuttgard");
		GraphNode kassel = new GraphNode("kassel");
		GraphNode karlsruhe = new GraphNode("karlsruhe");
		GraphNode erfurt = new GraphNode("erfurt");
		GraphNode numberg = new GraphNode("numberg");
		GraphNode augsburg = new GraphNode("augsburg");
		GraphNode munchen = new GraphNode("munchen");

		Graph g = new Graph();

		g.nodes.add(frankfurt);
		g.nodes.add(mannheim);
		g.nodes.add(wurzburg);
		g.nodes.add(stuttgard);
		g.nodes.add(kassel);
		g.nodes.add(karlsruhe);
		g.nodes.add(erfurt);
		g.nodes.add(numberg);
		g.nodes.add(augsburg);
		g.nodes.add(munchen);

		frankfurt.addAdjacentNode(mannheim);
		frankfurt.addAdjacentNode(wurzburg);
		frankfurt.addAdjacentNode(kassel);

		mannheim.addAdjacentNode(karlsruhe);

		karlsruhe.addAdjacentNode(augsburg);

		augsburg.addAdjacentNode(munchen);

		munchen.addAdjacentNode(kassel);
		munchen.addAdjacentNode(numberg);

		wurzburg.addAdjacentNode(erfurt);
		wurzburg.addAdjacentNode(numberg);

		numberg.addAdjacentNode(stuttgard);

		g.printBFS(frankfurt);
	}
	
}

class GraphNode {
	String data;
	boolean isVisited = false;
	ArrayList adjacencyList = new ArrayList();
	GraphNode(String data)
	{
		this.data = data;
	}
	public void addAdjacentNode(GraphNode n)
	{
		adjacencyList.add(n);
		n.adjacencyList.add(this);
	}
}

class Graph {
	ArrayList nodes = new ArrayList();
	public void printBFS(GraphNode root)
	{
		ArrayList q = new ArrayList();
		root.isVisited = true;
		q.add(root);
		while(q.size() > 0)
		{
			GraphNode g = (GraphNode) q.get(0);
			System.out.println(g.data);
			for(int i=0; i<g.adjacencyList.size(); i++)
			{
				GraphNode ga = (GraphNode) g.adjacencyList.get(i);
				if(!ga.isVisited)
				{
					ga.isVisited = true;
					q.add(ga);
				}
			}
			q.remove(0);
		}
	}
}
