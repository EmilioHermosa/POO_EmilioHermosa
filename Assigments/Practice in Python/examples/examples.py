name = "Wladymir"
age = 22

result = age ** 2

names = ["Stiven", "Dennis", "Adrian", "Jerico"]
names.append("Diego")
names.extend(["Armando", "Stalin"])
names.insert(0, "Wladymir")
return_name = names.pop
print(names)
print(return_name)

ages = [18, 60 ,23, 22, 26]

names.extend(ages)
print(names)

names_with_ages = zip(names, ages)

for student in names_with_ages:
      print(student)

my_tuple = ("Stiven", "Dennis")
my_tuple[0] = "Emilio"
