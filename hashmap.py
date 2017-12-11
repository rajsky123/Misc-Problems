a={}
nn=input("enter range:")
for i in range(1,int(nn)+1):
    strr=input("enter "+str(i)+":")
    if(a.get(strr)!=None):
        a[strr]=a[strr]+1
    else:
        a[strr]=1
print(a)
