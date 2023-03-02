
def printBin(self, num: float) -> str:
    res = "0."
    while len(res) <= 32 and num != 0:
        num *= 2
        # print("num: ", num)
        digit = int(num)
        # print("digit: ", digit)
        res += str(digit)
        num -= digit
        # print("res: ", res)
    return res if len(res) <= 32 else "ERROR"

def main():
    print(printBin(any, 0.625)) # 0.101

if __name__ == "__main__":
    main()