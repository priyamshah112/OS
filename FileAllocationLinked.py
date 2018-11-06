import random
nB=int(input("Enter number of Blocks: "))
sizeB=int(input("Enter size of each block: "))
n=nB*sizeB
startBlock=0
fileName=[]
fileSize=[]
sb=[]  # for storing starting index 
last=-1
block = [[-1 for x in range(2)] for y in range(nB)]
sb=[]
sums=0
while True:
  nameF=int(input("Enter file name : "))
  sizeF=int(input("Enter size of file : "))
  sums=sums+sizeF
  if sums > n:
    print("Cannot Allocate more Files")
    break
  else:
    nBAssigned=int(sizeF/sizeB)
    remainder=int(sizeF % sizeB)
    if remainder != 0:
      nBAssigned=nBAssigned+1
    nz=0
    for x in range (nB):
      if block[x][0]==-1:
        nz=nz+1 
    count=0
    if nz>=nBAssigned:
      while count<nBAssigned:
        x=random.randint(0,9)
        if block[x][0]==-1:
          count=count+1
          block[x][0]=nameF
          if last!=-1:
            block[last][1]=x
          else:
            sb.append(x)
          last=x
      fileName.append(nameF)
      fileSize.append(sizeF)
    else:
      print("File Cannot Allocate")
      break
      
print("\n\nBlocks:")
print(block)
print("\n\nFile Allocation")
print("Files\t\tSize")
for i in range (len(fileName)):
  print("File "+str(fileName[i])+"\t\t"+str(fileSize[i]))

print("File allocation of starts from File "+str(fileName[0])+" and starting index is ",sb)
