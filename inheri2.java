package zoho;

public class inheri2 {
public static void main(String[] args) {
	
	BoxWeight bw=new BoxWeight(20,13,14,13);
	BoxWeight bw2=new BoxWeight(22,12,16,17);
	BoxWeight bw3=new BoxWeight();
	BoxWeight bw4=new BoxWeight(5, 2);
	BoxWeight bw5=new BoxWeight(bw);
	
	
	Box pb=new Box();
	double vol;
	
	vol=pb.volume();
	System.out.println(vol);
System.out.println();
	vol=bw.volume();
	System.out.println("Volume "+vol);
	System.out.println(bw.weight);
	System.out.println();
	vol=bw2.volume();
	System.out.println("Volume "+vol);
	System.out.println(bw2.weight);
	
	System.out.println();
	ColorBox c1=new ColorBox(38.7, 32.1, 9.7, "Red");
	vol=c1.volume();
	System.out.println("Volume "+vol);
	System.out.println(c1.color);
	System.out.println();
	ColorBox c2=new ColorBox(38.7, 6.1, 9.7, "Skyblue");
	vol=c2.volume();
	System.out.println("Volume "+vol);
	System.out.println(c2.color);
	
	
	System.out.println();
	vol=bw3.volume();
	System.out.println(vol);
	System.out.println(bw3.weight);
	
	System.out.println();
	
	vol=bw4.volume();
	System.out.println(vol);
	System.out.println(bw4.weight);
	System.out.println();
	vol=bw5.volume();
	System.out.println(vol);
	System.out.println(bw5.weight);
	System.out.println();

}
}


class Box{
	
 private    double width;
 private	double height;
 private	double depth;
	
	Box(double d,double h,double w){
		this.width=w;
		this.height=h;
		this.depth=d;
	}
	Box(Box ob){
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	
	Box(){
		width=-1;
		height=-1;
		depth=-1;
	}
	
	Box(double len){
		width=height=depth=len;
	}
	
	
	double volume() {
		return width*height*depth;
	}
	
}

class BoxWeight extends Box{
	double weight;
	
	BoxWeight(double len,double m){
		super(len);
		weight=m;
	}
	
	public BoxWeight() {
		super();
		weight=-1;
	}
	
	
	
	public BoxWeight(BoxWeight b) {
		super(b);
		weight=b.weight;
	}
	public BoxWeight(double w,double h,double d,double m) {
		super(w,h,d);
		weight=m;
	}
	
}

class ColorBox extends Box{
	String color;
	
	ColorBox(double len,String c){
		super(len);
		
	}
	
	public ColorBox() {
		super();
		color="null";
	}
	
	public ColorBox(double d,double w,double h,String c) {
		super(d,w,h);
		color=c;
	
	}
}



