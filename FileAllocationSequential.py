# Delete
def delete1():

  s = int(input("\nEnter file to be deleted"))
  flag = False
  for i in range(number_of_block):
    if(block[i]==s):
      block[i]=-1
      if flag==False:
        flag=True
        w=nm.index(int(s))
        nm.remove(int(s))
        st.pop(int(w))
        ln.pop(int(w))
      
  print("\nAfter deletion")    
  print(block)

  print("\t\tFile Allocation table")
  print("File Name \t Start Block \t Size")
  try:

    for i in range(number_of_file):
      print("File "+str(nm[i])+" \t\t"+str(st[i])+" \t\t"+str(ln[i]))
  except:
    pass

def edit():
  file_size = int(input("enter size of file "+str(nm[-1]+1)))
  temp =  file_size % size_of_block
  temp1 = file_size // size_of_block
  count=0
  if(temp!=0):
    temp1=temp1+1
  for i in range(number_of_block):

    if block[i]==-1 or block[i]==250 and number_of_block-i>=temp1:

      for j in range(temp1):
        if block[i+j]==-1 or block[i+j]==250:
          count=count+1
        if count==temp1:
          for k in range(temp1):
            block[i+k]=nm[-1]+1
          nm.append(nm[-1]+1)
          st.append(i+k)
          ln.append(file_size)
        else:
          continue
    else:
      continue
  print(block)
  print("File Allocation table")
  print("File Name \t Start Block \t Size")
  try:
    for i in range(len(nm)):
      print("File "+str(nm[i])+" \t\t"+str(st[i])+" \t\t"+str(ln[i]))
  except:
    pass

if __name__ == "__main__":
  number_of_block = int(input("Enter Number of blocks "))
  size_of_block = int(input("Enter size of a block "))
  total_size = number_of_block * size_of_block
  block = [size_of_block]*number_of_block
  start_block = 0
  nm=[]
  st=[]
  ln=[]
  print("\nInitial Blocks",block)
  number_of_file = int(input("enter number of file "))
  for i in range(number_of_file):
    file_size = int(input("enter size of file "+str(i)+" "))
    temp =  file_size % size_of_block
    temp1 = file_size // size_of_block
    
    if(temp!=0):
      temp1=temp1+1
    if(number_of_block-start_block >= temp1):
      for j in range(temp1):
        block[start_block+j] = i
        print("block "+str(start_block+j)+" Allocated to file "+str(i))
      nm.append(i)
      st.append(start_block)
      ln.append(file_size)
      start_block = start_block + temp1
    else:
      print("File cannot be allocated")
  print("Blocks")
  print(block)

  print("File Allocation table")
  print("File Name \t Start Block \t Size")
  try:

    for i in range(number_of_file):
      print("File "+str(nm[i])+" \t\t"+str(st[i])+" \t\t"+str(ln[i]))
  except:
    pass

  while True:
    i = int(input("Enter your choice 1]delete 2]Update "))
    if i==1:
      delete1()
    elif i==2:
      edit()
    else:
      exit()



# 20
# 250
# 4
# 600
# 800
# 1000
# 300
