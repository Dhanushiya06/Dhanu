const compute = () => {
  let amount = document.getElementById("amount").value;
  let interestRate = document.getElementById("interest").value;
  let months = document.getElementById("month").value;
  
let interest = (amount*(interestRate*0.1))/months;
let payment = (amount/months + interest).toFixed(2);

document.getElementById("payment").innerHTML = "Monthly payment : Rs. " +payment;
};
