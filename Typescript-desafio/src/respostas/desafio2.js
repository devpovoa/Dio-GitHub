"use strict";
var Job;
(function (Job) {
    Job[Job["Actress"] = 0] = "Actress";
    Job[Job["Baker"] = 1] = "Baker";
})(Job || (Job = {}));
const person1 = {
    name: "Maria",
    age: 29,
    job: Job.Actress,
};
const person2 = {
    name: "Roberto",
    age: 19,
    job: Job.Baker,
};
const person3 = {
    name: "Laura",
    age: 32,
    job: Job.Actress,
};
const person4 = {
    name: "Carlos",
    age: 19,
    job: Job.Baker,
};
console.log(person1);
console.log(person2);
console.log(person3);
console.log(person4);
