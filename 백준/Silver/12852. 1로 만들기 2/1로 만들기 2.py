import sys
input = sys.stdin.readline
x=int(input())
dP=[[0,[]] for _ in range(x+1)]
 
dP[1][0]=0
dP[1][1]=[1]
 
for i in range(2,x+1):
    dP[i][0]= dP[i-1][0]+1
    dP[i][1]= dP[i-1][1]+[i]
 
 
    if i%2==0 and dP[i][0]>dP[i//2][0]+1:
        dP[i][0] = dP[i//2][0] + 1
        dP[i][1] = dP[i//2][1] + [i]
 
    if i%3==0 and dP[i][0]> dP[i//3][0]+1:
        dP[i][0] = dP[i//3][0] + 1
        dP[i][1] = dP[i//3][1] + [i]
 
 
print(dP[x][0])
dP[x][1].reverse()
for i in dP[x][1]:
    print(i,end=" ")