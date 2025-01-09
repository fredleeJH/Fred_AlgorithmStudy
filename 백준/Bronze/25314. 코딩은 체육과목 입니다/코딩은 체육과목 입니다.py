n = int(input())
output = 'int'
for i in range(n//4):
    output = 'long ' + output
print(output)