🔹 Step 3: compareTo() is invoked

Suppose list:

[Prem:80, Ravi:90, Anita:70]


During sort:

It compares Prem and Ravi:

Prem.compareTo(Ravi) // this = Prem, other = Ravi


Inside compareTo: this.marks - other.marks = 80 - 90 = -10

Negative → Prem comes before Ravi

Next, it compares Prem and Anita:

Prem.compareTo(Anita) // this = Prem, other = Anita


this.marks - other.marks = 80 - 70 = 10

Positive → Prem comes after Anita

Sorting algorithm swaps objects accordingly