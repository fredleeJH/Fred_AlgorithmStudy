n = int(input())
generator = 0 # 생성자 저장

for i in range(1, n+1):
    num = sum(map(int, str(i)))
    if i + num == n:
        generator = i
        break
if generator:
    print(generator)
else:
    print(0)
