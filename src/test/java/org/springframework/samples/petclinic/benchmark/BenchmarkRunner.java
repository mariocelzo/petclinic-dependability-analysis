/*
 * Copyright 2012-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.benchmark;

import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * Main class to run all JMH benchmarks for PetClinic application. This class configures
 * and executes performance benchmarks for critical components.
 *
 * Usage: - Run via IDE: Execute main method directly - Run via Maven: mvn exec:java
 * -Dexec.mainClass="org.springframework.samples.petclinic.benchmark.BenchmarkRunner"
 *
 * @author Dependability Analysis Team
 */
public class BenchmarkRunner {

	public static void main(String[] args) throws RunnerException {
		Options opt = new OptionsBuilder().include(".*Benchmark.*")
			.forks(0) // No forking to avoid classpath issues
			.warmupIterations(2)
			.measurementIterations(3)
			.resultFormat(ResultFormatType.JSON)
			.result("target/jmh-results.json")
			.build();

		new Runner(opt).run();
	}

}
