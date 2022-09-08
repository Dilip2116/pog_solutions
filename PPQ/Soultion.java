import java.util.Scanner;
public class Soultion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int id=0;
		String name;
		int vac ;
		double fee;



		Hostel [] obj =new  Hostel[4];

		for(int i=0;i<4;i++)
		{
			id=sc.nextInt();
			sc.nextLine();
			name=sc.nextLine().toLowerCase();
			vac = sc.nextInt();
			fee=sc.nextDouble();

			obj[i]= new Hostel(id, name, vac, fee);
		}
		sc.nextLine();
		String na=sc.nextLine();

		double f=sc.nextDouble();

		int v=searchHostelByName(obj, na);
		if(v!=0)
			System.out.println(v);
		else
			System.out.println("No Hostel found");

		Hostel []HH = sortHostelByfee(obj, f);
		if(HH.length>0 && HH!=null) {
		for(int i=0;i<HH.length;i++)
		{
			if(HH[i]!=null)
				System.out.println(HH[i]);
			else
				continue;
		}
		}
		else
			System.out.println("No Hostel Found");
		sc.close();

	}



	public static int searchHostelByName(Hostel []H,String name)
	{
		for(int i=0;i<H.length;i++)
		{
			if(H[i].getHostelName().equals(name.toLowerCase()))
			{
				return H[i].getVacancies();
			}
		}
		return 0;
	}

	public static Hostel[] sortHostelByfee(Hostel []H,double f)
	{
		Hostel []H1 = new Hostel[4];
		int k=-1;
		for(int i=0;i<H.length;i++)
		{
			if(H[i].getFee()<f)
			{
				H1[++k]=H[i];
				//System.out.println(H1[k].getHostelName());
			}

		}
		if(k==-1)
			return null;
		else
		{
			for(int i=0;i<k;i++)
			{
				for(int j=i+1;j<k;j++)
				{
					if(H1[i].getFee()>H1[j].getFee())
					{
						Hostel temp=H1[i];
						H1[i]=H1[j];
						H1[j]=temp;;
					}

				}
			}
		}
		return H1;


	}
}
