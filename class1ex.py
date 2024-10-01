class Greeting:
    def __init__(self ,x ,y):
        self.x = x
        self.y = y

    def hello_comp(self):
        return "Hello Calvin"

    def greet(self):
        return "my age 21"

x = Greeting("Greeting1", "greeting2")
print(x.hello_comp())
print(x.greet())
