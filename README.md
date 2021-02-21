# Data-structure-and-Algorithm
2019 2nd Semester Bangor SC by Dr. Ik Soo Lim


#### Assessment2 - Comparative Studies of BST and Sorted Arrays

- T1. runs empirical studies to compute teh average length of a path to a random node in BST(Binary Search Tree) built by insertion of N random keys into an initially empty tree, for N from 100 to 10000.
- Do 1000 trials for each tree size.
  - for a given tree size N, build a BST by insertion of N random keys; e.g., randomly shuffle numbers of 0 to N-1 and insert them into an (initially empty) BST.
  - Randomly pick a node in the BST; e.g., randomly pick a number between 0 and N-1.
  - Compute the length of a path to the node, i.e., the number of compare's carried out while searching the node in the BST.
  - Repeat Step 1b and 1c for 1,000 trials and get the average number of compare'.

- Plot the results with the horizontal axis representing tree size N and the vertical axis representing (average) number of compare's; The plotting can be done usnig any external software such as spreadsheets.

- T2. Run Similar empirical studies to compute the average number of compare's in Binary Search with an (sorted) array. Note that this has nothing to do with inserting sorted data into BST. Plot the results.

- T3. Compare those plots from T1 to T2; e.g., overlay the plots together. Discuss whether one could draw a conclusion that the search with BST is more efficient than Binary Search with an (sorted) array or the otehr way around, etc.

