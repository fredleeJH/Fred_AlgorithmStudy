#7568 덩치
# 내 덩치는 아마 우주 꼴찌.. 이것도 for문을 이용한 브루트포스 문제

num = int(input())
dungchi = []
for i in range(num):
    weight, height = map(int, input().split(" "))
    dungchi.append((weight,height))

for i in dungchi:
    count = 1
    for j in dungchi:
        if i[0] <j[0] and i[1] < j[1]:
            count += 1

    print(count, end = " ")

