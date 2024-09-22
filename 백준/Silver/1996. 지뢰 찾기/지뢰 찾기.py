#1996 지뢰 찾기
num = int(input())
array = [0 for i in range(num)]
real_landmine = [[0] * num for i in range(num)]

for i in range(num):
    array[i] = list(map(str, input()))

for i in range(num):
    for j in range(num):
        count = 0
        if array[i][j].isdigit():
            real_landmine[i][j] = "*"
        else:
            if i-1 >= 0: #자신의 바로위,왼,오 / 맨 윗줄이면 count하지 않음.
                if array[i-1][j].isdigit():
                    count += int(array[i-1][j])
                if j-1 >= 0: # 자신의 왼쪽 위 / 맨 왼쪽이면 count하지 않음.
                    if array[i-1][j-1].isdigit():
                        count += int(array[i-1][j-1])
                if j+1 <= num-1: # 자신의 오른쪽 위 / 맨 오른쪽이면 count하지 않음.
                    if array[i-1][j+1].isdigit():
                        count += int(array[i-1][j+1])

            if j-1 >= 0: # 자신의 바로 왼쪽 값 / 맨 왼쪽이면 카운트 x
                if array[i][j-1].isdigit():
                    count += int(array[i][j-1])

            if j+1 <= num-1: # 자신의 바로 오른쪽 값 / 맨 오른쪽이면 카운트 x
                if array[i][j+1].isdigit():
                    count += int(array[i][j+1])

            if i+1 <= num-1: #자신의 바로 아래, 왼, 오 / 맨 아랫줄이면 카운트 x
                if array[i+1][j].isdigit():
                    count += int(array[i+1][j])
                if j-1 >= 0: #자신의 바로 아래 왼쪽 / 맨 왼쪽이면 카운트 x
                    if array[i+1][j-1].isdigit():
                        count += int(array[i+1][j-1])
                if j+1 <= num -1: #자신의 바로 아래 오른쪽 / 맨 오른쪽이면 카운트 x
                    if array[i+1][j+1].isdigit():
                        count += int(array[i+1][j+1])
            if count >= 10: #주변 지뢰가 10개가 넘어간다면 M출력
                real_landmine[i][j] = "M"
            else: #주변 지뢰가 10개가 안되면 그냥 count 출력
                real_landmine[i][j] = count

for i in range(num):
    for j in range(num):
        print(real_landmine[i][j],end = "") # 2차원배열을 출력하기 end를써서 i0일때 즉 첫번째 줄 출력
    print() # n번째 줄이 출력되면 줄 건너띄기