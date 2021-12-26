def main():
    word = input()
    if word.endswith("er"):
        print(word[-2:])
    elif word.endswith("ist"):
        print(word[-3:])
    else:
        print("Error")

# call main
if __name__ == "__main__":
    main()
