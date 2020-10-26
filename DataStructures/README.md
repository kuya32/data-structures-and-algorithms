# Table of Contents

1. [Code Challenge 30: Hash Table Implementation](#Hash-Table-Implementation)

## Hash Table Implementation

### Hashtables

Within the hashtable, the user specifies a key and the value you eant to link with that key. The key is then **hashed**, the hash code is used as the index and the value is stored within the table.

### Challenge 30

- Implement the Hashtable with the following methods:
  - Add
  - Get
  - Contains
  - Hash
- Create tests to make sure the methods are returning the correct results

### Approach & Efficiency 30

- Big O
  - Time: O(1)
  - Space: O(1)

### API 30

- ``add``
  - Takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
- ``get``
  - Takes in the key and returns the value from the table.
- ``contains``
  - Takes in the key and returns a boolean, indicating if the key exists in the table already.
- ``hash``
  - Takes in an arbitrary key and returns an index in the collection.
