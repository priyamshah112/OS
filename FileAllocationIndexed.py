if __name__ == "__main__":
  ind = int(input("enter index block "))
  number_of_block = int(input("Enter Number of blocks "))
  size_of_block = int(input("Enter size of a block "))
  total_size = number_of_block * size_of_block
  block = [size_of_block]*number_of_block
  start_block = 0
  nm=[]
  st=[]
  ln=[]
  block[ind]=999
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
        if block[start_block+j]!=999:
          block[start_block+j] = i
          print("block "+str(start_block+j)+" Allocated to file "+str(i))
          flag1=False
        else:
          block[start_block+j+1] = i
          print("block "+str(start_block+j+1)+" Allocated to file "+str(i))
          flag1=True          
      nm.append(i)
      st.append(start_block)
      ln.append(file_size)
      if flag1==True:
        start_block = start_block + temp1+1
        flag1==False
      else:
        start_block = start_block + temp1
    else:
      print("File cannot be allocated")
  print("Blocks")
  print(block)

  print("\tFile Allocation table")
  print("File Name \t Index Block")
  try:

    for i in range(number_of_file):
      print("File "+str(nm[i])+" \t\t"+str(ind))
  except:
    pass

  print("\tIndex Block Table for index "+str(ind))
  print("Start \t Size")
  try:
    for i in range(number_of_file):
      print(str(st[i])+" \t"+str(ln[i]))
  except:
    pass




# 2
# 10
# 250
# 4
# 600
# 800
# 800
# 200

