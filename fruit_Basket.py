basket = []

fruit = ['Apple','Orange','Mango','Guava']
f = ['A','O','M','G']

print("Catch and eat any of these fruits: ", fruit, ": ")
catch = int(input("How Many fruits would you like to catch: "))

for i in range(catch):
    choice = input("Choose a fruit to catch. Press A, O, M, or G: ").upper()[0]
    print('Fruit ', (i + 1), 'of', catch)
    if choice == f[0]:
        basket.append(fruit[0])
    elif choice == f[1]:
        basket.append(fruit[1])
    elif choice == f[2]:
        basket.append(fruit[2])
    elif choice == f[3]:
        basket.append(fruit[4])
    elif choice == f[4]:
        basket.append(fruit[4])
    else:
        print("Invalid input.")

print("Your basket now has:")
for x in basket:
    print(x)

for j in range(catch):
    remove = input("Press 'E' to eat a fruit:").upper()
    if remove == 'E':
        basket.pop()
        if not basket:
            print("No More Fruits.")
        else:
            print("Fruit(s) in the basket: ", str(basket))
    else:
        print("Invalid Input.Please try again.")

