package bubbleandselection;

public class listele {
	
	int[] liste;
	int elemansayisi;
	int sinir;
	// construcur'a kaç elemanlý liste olcaðýný yolluyoz
	public listele (int elemanKapasitesi) {
		
		liste= new int[elemanKapasitesi];
		elemansayisi=0;
		sinir=elemanKapasitesi;
	}
	
	public void listeyeEkle(int eklenecekOlan) {
		if(elemansayisi<sinir) 
		{
	liste[elemansayisi]= eklenecekOlan;
	elemansayisi++;
		}
		else
			System.out.println("liste dolu!!");
	}
	public void yaz()
	{
		for(int i=0;i< elemansayisi;i++)
		{
			System.out.print(liste[i]+" ");
		}
	}
	public int yazs(int i)
	{
		
		
			//System.out.print(liste[i]+" ");
			return liste[i];
		
	}
	
	

	public void sondansil() {
		if(elemansayisi>0) {
		elemansayisi--;
		liste[elemansayisi]=-1;
		}
		else
			System.out.println("liste boþ!!");
	}
	public void bastansil() {
		for(int i=0;i< elemansayisi-1;i++)
		{
			liste[i]=liste[i+1];
		}
		elemansayisi--;
		
	}
	public void arayaekle(int eklenecek,int konum)
	{
		   
			
			
		for(int i =elemansayisi-1;i>=konum;i--)
		{
			liste[i+1]=liste[i];
			
		}
		liste[konum]=eklenecek;
		elemansayisi++;
	}
	public void aradanSil(int konum)
	{
		for(int i=konum-1;i<elemansayisi;i++)
		{
			liste[i]=liste[i+1];
		}
		elemansayisi--;
	}
	
	public int max()	
	{
		int enBuyuk=liste[0];
		
		for(int i=0;i<elemansayisi;i++)
		{
			if(liste[i]>0)
			{
			 enBuyuk=liste[i];	
			}
		}
		return enBuyuk;
	}
	
	public int min()	
	{
		int enKucuk=liste[0];
		
		for(int i=0;i<elemansayisi;i++)
		{
			if(liste[i]<0)
			{
			 enKucuk=liste[i];	
			}
		}
		return enKucuk;
	}
	
	public void swap(int i1, int i2)//dizi elemanlarýnda yer deðiþtirme
	{
		int tmp=liste[i1];
		liste[i1]=liste[i2];
		liste[i2]=tmp;
		
	}
	
	public void SelectionSort()//küçükten büyüðe
	{
			
		
		int enKucukIndex;
		
		for(int i=0;i<elemansayisi;i++)
		{
			enKucukIndex=i;
			
			for(int j=i;j<elemansayisi;j++)
			{
				if(liste[j]<liste[enKucukIndex])
				{
				 enKucukIndex=j;	
				}
			}
		
			swap(enKucukIndex,i);
			
		}
		
	}
	
	public void BubbleSort()
	{
		boolean swapped=true;
		
		while(swapped)
		{
			swapped=false;
			for(int i=1;i<elemansayisi;i++)
			{
				if(i-1>i)
				{
				swap(i-1,i);
				swapped=true;
				}
			}
		}
		
	}
	

}
