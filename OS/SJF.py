class Process:
    def __init__(self, p_no, at, bt,wt,tat,nt,ct):
        self.p_no = p_no
        self.at = at
        self.bt = bt
        self.wt =wt
        self.tat =tat
        self.nt =nt
        self.ct=ct
def main():
  n=int(input("Enter number of processes : "))
  pt = []
  avgwt=0
  avgtat=0
  avgnt=0
  for i in range(0,n):
    pt.insert(i,Process(i,int(input("Enter Arrival Time : ")),int(input("Enter Burst Time :")),0.0,0.0,0.0,0))
  pt.sort( key = lambda x: (x.at))
  visited=[0]*n
  pt[0].wt = 0
  pt[0].tat = pt[0].bt
  pt[0].nt = pt[0].tat/pt[0].bt
  avgtat+=pt[0].tat
  avgnt+=pt[0].nt
  time=pt[0].at+pt[0].bt
  visited[0]=1
  index=0
  pt[0].ct=time
  sj=[]
  sj.insert(0,pt[0])
  for j in range (1,n):
    small=999
    for i in range (1,n):
      if pt[i].at<=time:
        if  visited[i]==0:
          if pt[i].bt<small:
            small=pt[i].bt
            index=i
    visited[index]=1
    time=time+pt[index].bt
    pt[j].ct=time
    pt[j].tat=pt[j].ct-pt[index].at
    pt[j].wt=pt[j].tat-pt[index].bt
    pt[j].nt=pt[j].tat/pt[index].bt
    sj.append(pt[index])
    avgwt+=pt[j].wt
    avgtat+=pt[j].tat
    avgnt+=pt[j].nt
  avgwt/=n
  avgtat/=n
  avgnt/=n
  print("Process no.\t AT\t BT\t WT\t TAT\t NT\t CT\t")
  for i in range(0,n):
    print(str(sj[i].p_no)+" \t\t "+str(sj[i].at)+"  \t "+str(sj[i].bt)+"   \t "+str(round(sj[i].wt,2))+"  \t "+str(round(sj[i].tat,2))+"  \t "+str(round(sj[i].nt,2))+"  \t "+str(sj[i].ct))
  print("Average Waiting time "+str(round(avgwt,2)))
  print("Average turn around time "+str(round(avgtat,2)))
  print("Average Normalized time "+str(round(avgnt,2)))  
main()
