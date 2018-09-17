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
  pt[0].wt = 0
  pt[0].tat = pt[0].bt
  pt[0].nt = pt[0].tat/pt[0].bt
  pt[0].ct = pt[0].at+pt[0].bt
  avgtat+=pt[0].tat
  avgnt+=pt[0].nt
  for i in range(1,n):
    pt[i].ct = pt[i-1].ct+pt[i].bt
    pt[i].tat=pt[i].ct-pt[i].at
    pt[i].wt=pt[i].tat-pt[i].bt
    pt[i].nt=pt[i].tat/pt[i].bt
    avgwt+=pt[i].wt
    avgtat+=pt[i].tat
    avgnt+=pt[i].nt
  avgwt/=n
  avgtat/=n
  avgnt/=n
  print("Process no.\t Arrival time\t Burst Time\t Waiting time\t TAT\t normalize time\t")
  for i in range(0,n):
    print(str(pt[i].p_no)+" \t\t "+str(pt[i].at)+" \t\t "+str(pt[i].bt)+" \t\t "+str(round(pt[i].wt,2))+" \t\t "+str(round(pt[i].tat,2))+" \t\t "+str(round(pt[i].nt,2)))
  print("Average Waiting time "+str(round(avgwt,2)))
  print("Average turn around time "+str(round(avgtat,2)))
  print("Average Normalized time "+str(round(avgnt,2)))  
main()
