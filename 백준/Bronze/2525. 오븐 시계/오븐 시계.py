a,b = map(int, input().split())
c = int(input())
if ((b+c)>=60):
    a +=((b+c)//60)
    if(a>=24):
        a -=24
    b = (b+c)% 60
else:
    b +=c
print(a,b)