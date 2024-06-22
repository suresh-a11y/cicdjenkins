def call() {
  sh 'echo Hi From DevOps Team'
  sh"echo suresh here"
}

def name = "suresh"
println name
println "name is"+ name
println "name is $name"

def (a,b,c) = [10,20,30]
println a
println b
println c



def num = 20

if (num == 10){
  println "number is  $num"
}
else if(num >= 20){
  println "number is $num"
}
else {
  println "not number"
}

def x = 0
def result = ""

switch(x) {
  case 0:
      result = "x is zero"
      break
  case {x>0}:
      result = "x is +ve"
      break
}

println result

for ( i in [0, 1, 2, 3] ){
  println i
}

try {
  int u = 1/10
}catch(Exception exp){
  println " i am inside exception block"
  println exp.getCause()
  println exp.getMessage()
}

def map = ["name": "groovy"]
for ( e in map) {
  println e.key
}

int i=1

while (i<5) {
  println i
  i=i+1
}


def sum(int a, int b){
  println " sum is "+(a+b)
}

sum (5, 5)

def sub(int c, int d){
  def e = c-d
  return e
}

def re = sub(2,1)
println "result is"+re

def mylist = [1,3,5,["a","b","f"],10]

println mylist[2]

println mylist[4]

def employ = ["name": "suresh", "age": "30"]

println employ
println employ.name
println employ['name']
println employ.get('age')