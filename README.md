# Backstage HMCTS Examples

This project is intended to be used to produce examples of features that can be used for some of the plugins within the HMCTS instance of Backstage.

To see the examples in use please visit the [Backstage HMCTS Sandbox instance](https://backstage-sandbox.hmcts.net/)

# Features

The following Backstage features can be experimented with in this project:

## Architectual Decision Records (ADRs)

An ADR is a document that captures an important architectural decision made along with its context and consequences. This project contains an example of how to create and manage ADR's within Backstage.

To display ADR's in HMCTS Backstage, ensure the catalog-info.yaml for your project file contains the following annotation:

```yaml
metadata:
  annotations:
    backstage.io/adr-location: docs/adrs
```
and then in the root of your project create a directory called `docs/adrs` and add your ADR markdown files there. Once merged, your ADR should appear in Backstage when it next syncs the catalog.

For an example of how to structure a HMCTS ADR, please see this [template](https://tools.hmcts.net/confluence/display/DATS/ADR+Template).

<img width="1556" height="971" alt="Backstage ADR Screenshot" src="https://github.com/user-attachments/assets/d3d964b1-2bbb-4486-90dc-39608755c75c" />

Further details about the ADR Backstage plugin can be found [here](https://github.com/backstage/community-plugins/tree/main/workspaces/adr/plugins/adr).

## Notes

JUnit 5 is enabled by default in the project. Please refrain from using JUnit4 and use the next generation

## Building and deploying the application

### Building the application

The project uses [Gradle](https://gradle.org) as a build tool. It already contains
`./gradlew` wrapper script, so there's no need to install gradle.

To build the project execute the following command:

```bash
  ./gradlew build
```

### Running the application

Create the image of the application by executing the following command:

```bash
  ./gradlew assemble
```

Create docker image:

```bash
  docker-compose build
```

Run the distribution (created in `build/install/spring-boot-template` directory)
by executing the following command:

```bash
  docker-compose up
```

This will start the API container exposing the application's port
(set to `4550` in this template app).

In order to test if the application is up, you can call its health endpoint:

```bash
  curl http://localhost:4550/health
```

You should get a response similar to this:

```
  {"status":"UP","diskSpace":{"status":"UP","total":249644974080,"free":137188298752,"threshold":10485760}}
```

### Alternative script to run application

To skip all the setting up and building, just execute the following command:

```bash
./bin/run-in-docker.sh
```

For more information:

```bash
./bin/run-in-docker.sh -h
```

Script includes bare minimum environment variables necessary to start api instance. Whenever any variable is changed or any other script regarding docker image/container build, the suggested way to ensure all is cleaned up properly is by this command:

```bash
docker-compose rm
```

It clears stopped containers correctly. Might consider removing clutter of images too, especially the ones fiddled with:

```bash
docker images

docker image rm <image-id>
```

There is no need to remove postgres and java or similar core images.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

