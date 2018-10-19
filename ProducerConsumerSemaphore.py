import threading,time
import queue

q = queue.Queue(maxsize = 3)
global s
s=1

def semWait(s):
  if(s==1):
    return 0
  else:
    return -1

def semSignal(s):
  if s==0:
    return 1

def produce():
  if(q.full()):
    print("Cannot produce buffer full")
    return 0
  else:
    print("can produce buffer is not full")
    return 1

def producer():
  global s
  while True:
    if s==1:
      x=produce()
      if x==1:

        s=semWait(s)
        q.put(1)
        print(list(q.queue))
        time.sleep(5)
        s=semSignal(s)
      else:
        time.sleep(8)
    else:
      print("System busy!")
      time.sleep(8)

def consume():
  if(q.empty()):
    print("Cannot consume buffer empty")
    return 0
  else:
    print("can consume buffer is not empty")
    return 1

def consumer():
  global s
  while True:
    
    if s==1:
      x=consume()
      if x==1:
        s=semWait(s)
        q.get()
        print(list(q.queue))
        time.sleep(10)
        s=semSignal(s)
      else:
        time.sleep(8)
    else:
      print("System Busy!")
      time.sleep(8)
    

def main():

  p=threading.Thread(target=producer)

  c=threading.Thread(target=consumer)
  p.start()
  time.sleep(3)
  c.start()

  # c.start()
  # time.sleep(3)
  # p.start()
  p.join(100)
  c.join(100)
  if p.is_alive():
    p.exit()
  if c.is_alive():
    c.exit()
main()
