# Normal Form 1:
- Make sure each table has a single primary key
- Make sure each single cell does not hold multiple values </br>
- Make sure each record is unique </br>

# Normal Form 2:
- Make sure database is already in Normal Form 1 </br>
- Make sure tables do not contain partial dependency </br>

# Normal Form 3:
- Make sure database is already in Normal Form 2 </br>
- Make sure there are no transitive dependency for non-prime attributes </br>

# Boyce Codd Normal Form:
- Make sure database is already in Normal Form 3 </br>
- For every functional dependency where A -> B, then A has to be the super key of that table
