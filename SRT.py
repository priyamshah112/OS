class Process:
    def __init__(self, p_no, at, bt,wt,tat,nt,ct,rt):
        self.p_no = p_no
        self.at = at
        self.bt = bt
        self.wt =wt
        self.tat =tat
        self.nt =nt
        self.ct=ct
        self.rt=rt

def Shift(alist):
  alist.sort(key=lambda x:x.rt)
  return alist

def main():
  n=int(input("Enter number of processes : "))
  q=1
  pt = []
  chart = []
  queue=[]
  time=0
  ap=0 #arrived processes
  rp=0 #ready processes
  done=0 
  start=0
  avgwt=0
  avgtat=0
  avgnt=0

  for i in range(0,n):
    pt.insert(i,Process(i,int(input("Enter Arrival Time : ")),int(input("Enter Burst Time :")),0.0,0.0,0.0,0,0))
    pt[i].rt=pt[i].bt


  while(done<n):
  
    for i in range(ap,n):
      if time>=pt[i].at:
        queue.append(pt[i])
        ap+=1
        rp+=1
    
    if rp<1:
      chart.append(pt[0].p_no)
      time+=1
      continue
    
    if start:
      queue = Shift(queue)

    if queue[0].rt > 0:
      for g in range(time, time+q):
        chart.append(queue[0].p_no)
      time+=q
      queue[0].rt-=q
    else:
      pt[queue[0].p_no].ct=time
      queue.pop(0)
      done+=1
      rp-=1
    start=1
  
  print(chart)

  for i in range(0,n):
    pt[i].tat = pt[i].ct-pt[i].at
    avgtat+=pt[i].tat
    pt[i].wt = pt[i].tat - pt[i].bt
    avgwt+=pt[i].wt
    pt[i].nt = pt[i].tat / pt[i].bt
    avgnt+=pt[i].nt
    
  print("Process no.\t AT\t BT\t WT\t TAT\t NT\t CT\t")
  for i in range(0,n):
    print(str(pt[i].p_no)+" \t\t "+str(pt[i].at)+"  \t "+str(pt[i].bt)+"   \t "+str(round(pt[i].wt,2))+"  \t "+str(round(pt[i].tat,2))+"  \t "+str(round(pt[i].nt,2))+"  \t "+str(pt[i].ct))
  print("Average Waiting time",avgwt/n)
  print("Average TAT",avgtat/n)
  print("Average Normalized Time",avgnt/n)


main()
