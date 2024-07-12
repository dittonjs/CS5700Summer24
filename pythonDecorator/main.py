def log(func):
    def callback(*args):
        print("called with")
        print(args)
        return func(*args)

    return callback

# @log
def doMath(x, y):
    return x*y

myFunc = log(doMath)


print(myFunc(10, 20))
print(doMath(23,23))
