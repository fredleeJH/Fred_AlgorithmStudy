#10870 피보나치 수 5
#리스트의 크기를 동적으로 생성하는 방법
n = int(input())
fibonacci_list = [0 for i in range(21)]
fibonacci_list[0] = 0
fibonacci_list[1] = 1
result = 0
for i in range(2,n+1):
    fibonacci_list[i] = fibonacci_list[i-1]+fibonacci_list[i-2]
print(fibonacci_list[n])