# Jenkins Shared Pipeline

## Installation

Add it as a Shared Pipeline Library under _Manage Jenkins_ -> _Configure System_

## Usage

In your pipeline you can then do:

```
pipeline {
    agent none
    //...
    library 'socialengine'.parseJson(readFile('package.json'))
}
```