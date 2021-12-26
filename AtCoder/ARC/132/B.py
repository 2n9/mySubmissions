import copy

def main():
    n = int(input())
    p = list(map(int, input().split()))
    a = copy.copy(p)
    a.reverse()
    op = 0

    if sorted(p) == p:
        print(0)
        exit()

    while check(p):
        p = mvte(p)
        op += 1
    
    p = reve(p)
    op += 1

    print(op)
    
def reve(p):
    p.reverse()
    return p

def check(A):
    for i in range( len(A) - 1 ):
        if A[i] < A[i+1]:
            return False
        return True

def mvte(p):
    p.append(p.pop(0))
    return p

if __name__ == '__main__':
    main()
