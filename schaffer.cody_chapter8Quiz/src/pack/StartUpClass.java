package pack;

public class StartUpClass {

	public static void main(String[] args) {
		
		
		System.out.println("-------------------------------------------------------------------------------");
		Broadleaf bl = new Broadleaf(5000, "BroadLeaf tree");
		System.out.println(bl.getStyleLeaf());
		System.out.println(bl.getStyleTree());
		System.out.println(bl.leafNum);
		System.out.println(bl.name);
		bl.branches();
		bl.leaves();
		bl.trunk();
		bl.broadLeaves();
		
		
		System.out.println("-------------------------------------------------------------------------------");
		Maple m = new Maple(1010101010, "Maple Tree", 200);
		System.out.println(m.getStyleLeaf());
		System.out.println(m.getStyleTree());
		System.out.println(m.leafNum);
		System.out.println(m.name);
		System.out.println(m.getDaysTilFall());
		
		m.branches();
		m.leaves();
		m.trunk();
		m.broadLeaves();
		m.makeMapleSyrup();
		
		
		
		System.out.println("-------------------------------------------------------------------------------");
		Birch b = new Birch(404040, "Birch Tree", 100);
		System.out.println(b.getStyleLeaf());
		System.out.println(b.getStyleTree());
		System.out.println(b.leafNum);
		System.out.println(b.name);
		System.out.println(b.getSkinny());
		b.branches();
		b.leaves();
		b.trunk();
		b.broadLeaves();
		b.whiteWood();
		
		System.out.println("-------------------------------------------------------------------------------");
		Conifer c = new Conifer(500000000, "Conifer Tree");
		System.out.println(c.getStyleLeaf());
		System.out.println(c.getStyleTree());
		System.out.println(c.leafNum);
		System.out.println(c.name);
		c.branches();
		c.leaves();
		c.trunk();
		c.smallLeaves();
		c.hardWood();
		
		System.out.println("-------------------------------------------------------------------------------");
		Pine p = new Pine(300000000, "Pine Tree", 200);
		System.out.println(p.getStyleLeaf());
		System.out.println(p.getStyleTree());
		System.out.println(p.leafNum);
		System.out.println(p.name);
		System.out.println(p.getDaysTilFall());
		p.branches();
		p.leaves();
		p.trunk();
		p.smallLeaves();
		p.hardWood();//overridden
		c.hardWood();//overridden
		p.isInATemperateClimate();
		
		
		System.out.println("-------------------------------------------------------------------------------");
		Fir f = new Fir(400000000, "Fir Tree", 500);
		System.out.println(f.getStyleLeaf());
		System.out.println(f.getStyleTree());
		System.out.println(f.leafNum);
		System.out.println(f.name);
		System.out.println(f.getChop());
		f.branches();
		f.leaves();
		f.trunk();
		f.smallLeaves();
		f.hardWood();
		f.usedForChristmasTree();
		
		

	}

}
