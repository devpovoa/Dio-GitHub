const employeeObj: { code: number; name: string } = {
  code: 10,
  name: "John with object",
};

console.log(employeeObj);

interface employee {
  code: number;
  name: string;
}

const employeeInterface: employee = {
  code: 10,
  name: "John with interface",
};

console.log(employeeInterface);
