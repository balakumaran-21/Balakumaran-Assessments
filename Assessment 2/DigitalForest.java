package assessment3;

import java.util.ArrayList;
import java.util.Scanner;

interface Digitaltree{
	static Scanner input = new Scanner(System.in);
	public void absorbSunlight(int hours);
	public String getTreeDetails();
}

class BinaryTree implements Digitaltree{
	private String name;
	private int hours;
	private String type = "Binary";
	
	public BinaryTree() {
		System.out.print("Enter name of tree: ");
		name = input.nextLine();
	}
	
	public void absorbSunlight(int hours) {
		this.hours = hours;
	}
	
	public int energyProduced() {
		return 2*hours;
	}

	public String getTreeDetails() {
		String treeDetails =  type + " " + name + " - Energy" +this.energyProduced();;
		return treeDetails;
	}
	
}

class QuantumTree implements Digitaltree{
	private String name;
	private int hours;
	private String type = "Quantum";
	
	public QuantumTree() {
		System.out.print("Enter name of the tree: ");
		name = input.nextLine();
	}
	
	public void absorbSunlight(int hours) {
		this.hours = hours;
	}

	public String getTreeDetails() {
		String treeDetails =   type + " " + name + " - Energy" +this.energyProduced();
		return treeDetails;
	}
	
	public int energyProduced() {
		return 3*(hours*hours);
	}
	
}

class NeuralTree implements Digitaltree{
	private String name;
	private int hours;
	private String type = "Neural";
	
	public NeuralTree() {
		System.out.print("Enter name of the tree: ");
		name = input.nextLine();
	}
	
	public void absorbSunlight(int hours) {
		this.hours = hours;
	}
	
	public int energyProduced() {
		return (hours*hours*hours);
	}

	@Override
	public String getTreeDetails() {
		String treeDetails =  type + " " + name + " - Energy" +this.energyProduced();
		return treeDetails;
	}
}

class ForestManager{
	ArrayList<BinaryTree> binaryTreesInForest = new ArrayList<BinaryTree>();
	ArrayList<QuantumTree> quantumTreesInForest = new ArrayList<QuantumTree>();
	ArrayList<NeuralTree> neuralTreesInForest  = new ArrayList<NeuralTree>();
	
	public void addTree(NeuralTree tree) {
		neuralTreesInForest.add(tree);
	}
	public void addTree(BinaryTree tree) {
		binaryTreesInForest.add(tree);
	}	
	public void addTree(QuantumTree tree) {
		quantumTreesInForest.add(tree);
	}
	
	public void produceEnergyForForest(int hours) {
		int energy = 0;
		for(BinaryTree tree:binaryTreesInForest) {
			tree.absorbSunlight(hours);
			energy += tree.energyProduced();
		}
		for(QuantumTree tree:quantumTreesInForest) {
			tree.absorbSunlight(hours);
			energy += tree.energyProduced();
		}
		for(NeuralTree tree:neuralTreesInForest) {
			tree.absorbSunlight(hours);
			energy += tree.energyProduced();
		}
		System.out.println("Total energy produced: "+energy+" units");
	}
	
	public void getForestReport() {
		for(BinaryTree tree:binaryTreesInForest) {
			tree.getTreeDetails();
		}
		for(QuantumTree tree:quantumTreesInForest) {
			tree.getTreeDetails();
		}
		for(NeuralTree tree:neuralTreesInForest) {
			tree.getTreeDetails();
		}
	}
}

public class DigitalForest {

	public static void main(String[] args) {
		ForestManager forestManager = new ForestManager();
		BinaryTree tree1 = new BinaryTree();
		forestManager.addTree(tree1);
		QuantumTree tree2 = new QuantumTree();
		forestManager.addTree(tree2);
		QuantumTree tree3 = new QuantumTree();
		forestManager.addTree(tree3);
		forestManager.produceEnergyForForest(2);
		forestManager.getForestReport();
	}

}
