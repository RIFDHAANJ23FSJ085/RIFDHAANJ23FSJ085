package zoho;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MultiLevelinheritanceDemo {

	public static void main(String[] args) {
		Shipment s1=new Shipment(20, 10, 20, 50, 60);
		Shipment s2=new Shipment(10, 50, 20, 20, 90);
	
		double vol;
		
		vol=s1.volume();
		System.out.println(vol);
		System.out.println(s1.weight);
		System.out.println(s1.cost);
		System.out.println();
		
		vol=s2.volume();
		System.out.println(vol);
		System.out.println(s2.weight);
		System.out.println(s2.cost);
		System.out.println();
		
		
	
	}
}

class BBox{
	private double width;
	private double height;
	private double depth;
	
	public BBox(BBox b) {
		this.width=b.width;
		this.height=b.height;
		this.depth=b.depth;
	}
	
	public BBox(double w,double h,double d) {
		this.width=w;
		this.height=h;
		this.depth=d;
		
	}
	
	public BBox() {
		height=-1;
		depth=-1;
		width=-1;
	}
	
	BBox(double len){
		height=width=depth=len;
	}
	
double volume() {
	return height*width*depth;
}	
}

class WWeightBox extends BBox{
	 double weight;
	
	WWeightBox(double h,double d,double w,double we){
		super(w,h,d);
		this.weight=we;
	}
	
	WWeightBox(WWeightBox wb){
		super(wb);
		weight=wb.weight;
	}
	
	public WWeightBox() {
		super();
		weight=-1;
	}
	WWeightBox(double len,double w){
		super(len);
		weight=w;
	}
}


class Shipment extends WWeightBox{
	 double cost;
	
	public Shipment(Shipment s) {
		super(s);
		cost=s.cost;
	}
	
	public Shipment(double w,double h,double d,double we,double s) {
		super(w,h,d,we);
		cost=s;
	}
	
	public Shipment(double len,double w,double c) {
		super(len,w);
		cost=c;
	}
	public Shipment() {
		super();
		cost=-1;
	}
	
	
}
