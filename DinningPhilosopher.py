import threading,time,random

fork = [1,1,1,1,1]

def semWait(s,i):
  if(s==1):
    return 0
  else:
    print("fork "+str(i)+" is already being used by a philosopher")
    return 1

def semSignal(s):
  if s==0:
    return 1
  
def think(i):
  print("Philosopher "+str(i) +" thinking to pick a fork ")

def eat(i):
  print("Philosopher "+str(i) +" is eating with fork "+str(int(i) % 5)+" and "+str(int(i+1) % 5))

def philosopher(i):
  global fork
  while True:
    x= random.randint(1, 10)
    if(x<=5):
      think(i)
      time.sleep(10)
    
    fork[i]=semWait(fork[i],i)
    if fork[i]==0:
      fork[int(i+1) % 5]=semWait(fork[int(i+1) % 5],int(i+1) % 5)
      if fork[int(i+1) % 5]:
        eat(i)
        time.sleep(5)

        print("Philosopher "+str(i)+" eating finished with fork "+str(int(i) % 5)+" and "+str(int(i+1) % 5))
        fork[int(i+1) % 5]=semSignal(fork[int(i+1) % 5])
      fork[i]=semSignal(fork[i])

  time.sleep(5)  

def main():
  for i in range(0,5):
    p=threading.Thread(target=philosopher,args=(i,))
    p.start()

  p.join(200)
  if p.is_alive():
    p.exit()
main()
