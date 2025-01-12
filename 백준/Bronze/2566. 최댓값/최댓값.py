grid= []
for i in range(9):
    grid.append(list(map(int, input().split(" "))))
maxNum = 0
maxRow, maxCol = 0,0
for i in range(9):
    for j in range(9):
        if maxNum <= grid[i][j]:
            maxRow = i + 1
            maxCol = j + 1
            maxNum = grid[i][j]

print(maxNum)
print(maxRow, maxCol)