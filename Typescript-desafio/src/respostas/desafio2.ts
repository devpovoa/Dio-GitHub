interface Person {
  name: string;
  age: number;
  job: Job;
}

enum Job {
  Actress,
  Baker,
}

const person1: Person = {
  name: "Maria",
  age: 29,
  job: Job.Actress,
};

const person2: Person = {
  name: "Roberto",
  age: 19,
  job: Job.Baker,
};

const person3: Person = {
  name: "Laura",
  age: 32,
  job: Job.Actress,
};

const person4: Person = {
  name: "Carlos",
  age: 19,
  job: Job.Baker,
};

console.log(person1);
console.log(person2);
console.log(person3);
console.log(person4);
