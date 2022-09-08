
public class Polynomial {

	PolyNode start;

	public Polynomial() {
		this.start=null;
	}
	public void insert(float co , int ex) {

		PolyNode temp = new PolyNode(co,ex);

		if(start==null || ex>start.expo) {
			temp.next=start;
			start = temp;
			return;
		}
		PolyNode it = start;
		while(it.next!=null && it.next.expo>=ex) {
			it=it.next;
		}

		if(ex==it.expo) {
			it.coeff=it.coeff+co;
			return;
		}


		temp.next=it.next;
		it.next=temp;
		return;

	}

	public static String Display(PolyNode it)
	{
		//PolyNode it = p.start;
		String str = ""; 
		if(it==null) {
			return "EMPTY";
		}
		else {
			while(it!=null) {

				str+=it.coeff+"x^"+it.expo;
				it=it.next;
				if(it!=null)
					str+=" + ";
				else
					str+="\n";
			}
			return str;
		}
	}

	public Polynomial muti_poly(Polynomial p2) {

		Polynomial p3 = new Polynomial();
		PolyNode it1 =this.start;
		PolyNode it2 = p2.start;

		while(it1!=null) {
			float co =0;
			int ex=0;
			while(it2!=null) {
				co = it1.coeff*it2.coeff;
				ex = it1.expo+it2.expo;
				p3.insert(co, ex);
				//System.out.println(p3);
				it2=it2.next;
			}
			it2=p2.start;
			it1=it1.next;
		}
		return p3;
	}

	public void append(float co,int ex) {
		PolyNode temp = new PolyNode(co,ex);
		if(start == null) {
			start =temp;
		}
		else {
			PolyNode it = start;
			while(it.next!=null) {
				it=it.next;
			}
			it.next=temp;
		}
	}
	
	public static PolyNode add_poly(Polynomial poly1,Polynomial poly2) {
		PolyNode p1 =poly1.start;
		PolyNode p2 = poly2.start;
		PolyNode res=new PolyNode(0,0);
		PolyNode temp=res;
		while(p1!=null&&p2!=null){
		    if(p1.expo==p2.expo){
		        temp.next=new PolyNode(p1.coeff+p2.coeff,p2.expo);
		        p1=p1.next;
		        p2=p2.next;
		    }
		   else if(p1.expo>p2.expo){
		temp.next=p1;
		p1=p1.next;
		    }
		    else{
		     temp.next=p2;
		p2=p2.next;   
		    } 
		temp=temp.next;
		    }
		    if(p1==null)
		    temp.next=p2;
		    else
		    temp.next=p1;
		    return res.next;
		}
	}
	
	//end of Polynomial Class....

	
	class PolyNode {

		float coeff;
		int expo;
		PolyNode next;

		public PolyNode() {
			this.coeff=0;
			this.expo=0;
			this.next=null;
		}

		public PolyNode(float co,int ex) {
			coeff =co;
			expo=ex;
			next=null;
		}
	}// end of PolyNode Class......