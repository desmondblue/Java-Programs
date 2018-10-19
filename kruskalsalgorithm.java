import java.util.*;
class kruskalsalgorithm {
int i,j,k,a,b,u,v,n,ne=1;
int min,mincost=0;
int[][] cost= new int[9][9];
int parent[]=new int[9];
 int find(int t){
	 while(parent[t]){
		t=parent[t];
		return t;
	 }
	return t;
	}
int uni(int  a, int b){
if(a!=b){
	parent[b]=a;
	return 1;
}return 0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);			
	kruskalsalgorithm obj = new kruskalsalgorithm();
System.out.println("Enter no. of vertices");	
obj.n = scan.nextInt();
for( obj.i=1;obj.i<=obj.n;obj.i++){
	for(obj.j=1;obj.j<=obj.n;obj.j++){
		obj.cost[obj.i][obj.j]= scan.nextInt();
		if(obj.cost[obj.i][obj.j]==0){
			obj.cost[obj.i][obj.j]=999;
	}}
}
System.out.println("Edges of minimus cost spanning tree are ");
while(obj.ne<obj.n){
	for(obj.i=1,obj.min=999;obj.i<=obj.n;obj.i++){
		for(obj.j=1;obj.j<=obj.n;obj.j++){
			if(obj.cost[obj.i][obj.j]<obj.min){
				obj.min = obj.cost[obj.i][obj.j];
				obj.a=obj.u=obj.i;
				obj.b=obj.v=obj.j;	
			}
		}
	}
}obj.v= obj.find(obj.u);
obj.u=obj.find(obj.v);
if(obj.uni(obj.u,obj.v)==1){
	System.out.println((obj.ne++) +"edge"+ obj.a + obj.b + obj.min);
	obj.mincost+=obj.min;
}System.out.println("Mincost = " + obj.mincost);
}
}
