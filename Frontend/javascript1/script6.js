"use strict"; // Enable strict mode

        try {
            x = 10;  // Assigning to undeclared variable — causes error in strict mode
            var x;
            document.getElementById('demo').textContent = "Value of x is: " + x;
        } catch (error) {
            document.getElementById('demo').textContent = 
                "Error caught: " + error.message;
        }