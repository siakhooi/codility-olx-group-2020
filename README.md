# Codility Challenge: OLX Group 2020

## Multivitamin

- Difficulty: Medium
- There are N glasses of different capacities, each of them containing a different amount of a unique kind of juice. Calculate the maximum number of kinds of juice that can be mixed in a single glass.
- <https://app.codility.com/programmers/challenges/olx_group2020/>
- <https://app.codility.com/programmers/task/multivitamin/>

## Versions

- Result
  - `Good`: Correctness 100%, Performance 100%.
  - `OK`: Correctness 100%, Performance <100%.
- File naming convention
  - Code `A`: File `TheOLXGroup2020A.java`
  - Code `A2`: File `TheOLXGroup2020A2.java`

| Code | Complexity      | Description                                                  | Result | Report                                                                  |
| ---- | --------------- | ------------------------------------------------------------ | ------ | ----------------------------------------------------------------------- |
| `A`  | `O(N^2)`        | Sorted juice, using `int []`                                 | `OK`   | [WYKC29-9FG](https://app.codility.com/demo/results/trainingWYKC29-9FG/) |
| `A2` | `O(N * log(N))` | Sorted Juice, check only biggest capacity and biggest empty. | `Good` | [XYKRYX-DZ3](https://app.codility.com/demo/results/trainingXYKRYX-DZ3/) |
