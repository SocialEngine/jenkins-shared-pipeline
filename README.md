# Jenkins Shared Pipeline

## Installation

Add it as a Shared Pipeline Library under _Manage Jenkins_ -> _Configure System_

**Name**: _socialengine_
**Default Version**: _master_
**Retrieval Method**: _Modern SCM_

## Usage

After setting it up, you will have following variable available:

### parseJson

Parses json to be available to you as a LazyMap.

```
library 'socialengine'

pipeline {
    agent none
    //...stage,steps,etc
    script {
        def version = parseJson(readFile('package.json')).version
    }
}
```