const person = {
            name: "Alice",
            age: 25,
            city: "New York"
        };

        const ul = document.getElementById('person-details');

        // Use for...in loop to iterate over object properties
        for (let key in person) {
            const li = document.createElement('li');
            li.textContent = key + ": " + person[key];
            ul.appendChild(li);
        }