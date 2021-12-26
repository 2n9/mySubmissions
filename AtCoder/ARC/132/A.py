def main():
    n = int(input())
    R = list(map(int, input().split()))
    C = list(map(int, input().split()))
    q = int(input())
    
    r_c = []
    for i in range(q):
        r_c.append(list(map(int, input().split())))
    
    paint_history = []

    for i in range(q):
        if (R[r_c[i][0]-1] == C[r_c[i][1]-1]):
            paint_history.append('#')
        else:
            paint_history.append('.')
    
    for i in range(q):
        print(paint_history[i], end='')

if __name__ == "__main__":
    main()
