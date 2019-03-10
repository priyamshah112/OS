def FCFS(hp,requests):
	time = 0
	n = len(requests)
	pos = hp
	for request in requests:

		time += abs(request-pos)
		pos = request
		print("        ",pos,"  ",time)
	avg_seek_time = time / n
	return avg_seek_time

def SSTF(hp,requests):
  n=len(requests)
  pos=[0]*n
  req=[0]*n
  time=0
  headpos=hp
  for j in range (n):
    n1=len(requests)
    req=[0]*n1
    for i in range (n1):
      req[i]=abs(headpos-requests[i])
    minpos = req.index(min(req))
    time = time + abs(requests[minpos]-headpos)
    pos[j]=requests[minpos]
    print("        ",pos[j],"   ",time)
    headpos=requests[minpos]
    del req[minpos]
    del requests[minpos]
  
  avg_seek_time=time/n

  return avg_seek_time

def LOOK(hp,reqs):
  
  requests = reqs.copy()
  pos = hp
  time = 0
  sums=0
  last=hp
  end=200
  start=0
 
  #seek from curr_pos to end which is 200
  for i in range(pos,end+1):
    if i in requests:
      time=abs(last-i)
      sums=sums+time
      pos=i
      print("        ",i,"  ",time)
      last=i
      requests.remove(i)

  time+=abs(pos-end)
  pos=end
  #seek back to start
  for i in range(end,start-1,-1):
    if i in requests:
      time=abs(last-i)
      sums=sums+time
      pos=i
      print("        ",i,"  ",time)
      last=i
      requests.remove(i)
  # calculate average seek time
  print("Total sum",sums)
  avg_seek_time = sums/n
  return avg_seek_time

def SCAN(hp,reqs):
  requests = reqs.copy()
  pos = hp
  time = 0
  sums=0
  last=hp
  end=200
  start=0
  #seek from curr_pos to end which is 200
  for i in range(pos,end+1):
    if i in requests:
      time=abs(last-i)
      sums=sums+time
      pos=i
      print("        ",i,"  ",time)
      last=i
      requests.remove(i)
  last=199
  time=abs(last-pos)
  pos=199
  print("")
  print("Head position is reversed after ",pos,"  ",time)
  print("")
  sums=sums+time
  #seek back to start
  for i in range(end,start-1,-1):
    if i in requests:
      time=abs(last-i)
      sums=sums+time
      pos=i
      print("        ",i,"  ",time)
      last=i
      requests.remove(i)
  # calculate average seek time
  avg_seek_time = sums/n
  return avg_seek_time

def C_SCAN(hp,reqs):
  requests = reqs.copy()
  pos = hp
  time = 0
  sums=0
  last=hp
  end=200
  start=0
  #seek from curr_pos to end which is 200
  for i in range(pos,end+1):
    if i in requests:
      time=abs(last-i)
      sums=sums+time
      pos=i
      print("        ",i,"  ",time)
      last=i
      requests.remove(i)
  last=199
  time=abs(last-pos)
  pos=199
  print("")
  print("Head position is reversed after ",pos,"  ",time)
  print("")
  sums=sums+time
  pos=0
  time=abs(last-start+1)
  print("Head position is reversed after ",pos,"  ",time)
  last=0
  sums=sums+time
  #seek back to start
  for i in range(start,hp+1):
    if i in requests:
      time=abs(last-i)
      sums=sums+time
      pos=i
      print("        ",i,"  ",time)
      last=i
      requests.remove(i)
  # calculate average seek time
  avg_seek_time = sums/n
  return avg_seek_time


if __name__=='__main__':

  print("number of I/O requests")
  n = int(input())
  print("initial position of disc arm (less than 200)")
  hp = int(input())
  while hp>200:
    print("INVALID")
    hp = int(input())	
  print("Provide positions to visit : max is 200")
  requests = []
  r1 = []
  for i in range(n):
    req = int(input())
    requests.append(req)
    r1.append(req)
  print(requests)


  print("  ~~~~~~~~~     FCFS       ~~~~~~~~~")
  print("Avg seek time for  FCFS was ",FCFS(hp,requests))
  print(requests)
  print("  ~~~~~~~~~     SSTF       ~~~~~~~~~")
  print("Avg seek time for  SSTF was ",SSTF(hp,requests))
  print(r1)
  print("  ~~~~~~~~~     LOOK       ~~~~~~~~~")
  print("Avg seek time for  LOOK was ",LOOK(hp,r1))
  print(r1)
  print("  ~~~~~~~~~     SCAN       ~~~~~~~~~")
  print("Avg seek time for  SCAN was ",SCAN(hp,r1))
  print("  ~~~~~~~~~     CSCAN       ~~~~~~~~~")
  print("Avg seek time for  CSCAN was ",C_SCAN(hp,r1))  

# 9
# 100
# 55
# 58
# 39
# 18
# 90
# 160
# 150
# 38
# 184
