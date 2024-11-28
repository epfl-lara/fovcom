# Generated ASN.1/ACN Scala Encoders and Decoders with ASN1SCC
This repository contains the output from [ASN1SCC](https://github.com/esa/asn1scc) for the PUS-C services with the Scala backend.
The generated Scala files can be verified using the [Stainless verifier](https://github.com/epfl-lara/stainless).
Out of the 16 services, only service 4 is omitted since it uses floating-point arithmetic, which Stainless does not support at the time of writing.

To install Stainless, please refer to the [Quick Start section](https://github.com/epfl-lara/stainless?tab=readme-ov-file#quick-start).
Assuming the Stainless runner script `stainless-dotty` is in `$PATH`, you may verify a service using the `verify_service.sh` command followed by `service-XY` where `XY` stands for the service number (prefixed with 0 when the service number is below 10). For example, `./verify_service.sh service-02`.

This repository also includes the expected verification results for each services, stored in the `service-XY-results.txt` files.