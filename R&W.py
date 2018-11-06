import time
import threading

wrt=1 #Semaphore
readcount=0 #variable
mutex=1 #Semaphore for readcount doesn't get clash


def semWaitW():
  global wrt
  if wrt == 1:
    wrt=0
    return 0
  else:
    print("Writer already writing data to file")
    return 1

def semSignalW():
  global wrt
  if wrt == 0:
    wrt=1

def semWaitM():
  global mutex
  if mutex == 1:
    mutex=0
    return 0
  else:
    print("Some process is updating mutex")
    return 1

def semSignalM():
  global mutex
  if mutex == 0:
    mutex=1

def writeUnit():
  f = open("example.txt","a")
  f.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry. \n")
  print("Finished writing")
  f.close()

def readUnit():
  g = open("example.txt","r")
  s = g.read()
  print("From reader: ",s)
  print("Finished reading file")
  g.close()

def writer():

  while(True):
    x = semWaitW()
    if x==0:
      print("Lock with Writer")

      writeUnit()  
      time.sleep(5)

      print("Released Lock Writer")

      semSignalW()
    time.sleep(5)

def reader():
  global readcount 
  
  while(True):
    x=0  
    x1 = 0
    if x1 ==0:
      m = semWaitM()
      if m == 0:
        readcount=readcount+1
        print("rc="+str(readcount))
        if readcount==1:
          x = semWaitW() 
          if x==1:
            readcount=0
            print("rc decremented="+str(readcount))
        
        semSignalM()

        if x ==0:
          print("Lock with reader")
          # read operation
          readUnit()
          time.sleep(5)

          mn = semWaitM()
          if mn ==0:
            readcount=readcount-1
            print("readcount="+str(readcount))
            if readcount==0:
              semSignalW()
            semSignalM()

          print("Released Lock Reader")
    
    time.sleep(5)

def main():
  wt=threading.Thread(target=writer)
  rt=threading.Thread(target=reader)

  wt.start()    
  rt.start()

  wt.join(100)
  rt.join(100)
  if wt.is_alive():
    rt.exit()
  if wt.is_alive():
    rt.exit()

main()
