console.log('Start');

let name = 'Anna'; // Исправлено: добавлена переменная name
let age = 25;

function greet(person) {
  console.log('Inside greet:', person); // Исправлено: добавлены фигурные скобки
  return 'Hello, ' + person;
}

let message = greet(name); // Исправлено: заменено на правильное имя переменной
console.log('Result:', message); // Исправлено: заменено на правильное имя переменной

console.log('End');
