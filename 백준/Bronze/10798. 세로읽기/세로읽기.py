#10798 세로 읽기
table = []
for i in range(5):
    table.append(input())

for i in range(15):
    for j in range(5):
        if i < len(table[j]):
         print(table[j][i], end= "")