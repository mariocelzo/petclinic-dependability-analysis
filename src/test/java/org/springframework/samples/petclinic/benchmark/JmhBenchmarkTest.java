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

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

/**
 * JUnit test wrapper for JMH benchmarks. This allows running benchmarks through Maven
 * test phase with a specific profile.
 *
 * Run with: mvn test -Dtest=JmhBenchmarkTest -Dbenchmark=true
 *
 * @author Dependability Analysis Team
 */
@Tag("benchmark")
class JmhBenchmarkTest {

	/**
	 * Runs a quick benchmark with minimal iterations for validation. Use this to verify
	 * benchmarks work correctly before a full run.
	 */
	@Test
	@Disabled("Run manually with: mvn test -Dtest=JmhBenchmarkTest#runQuickBenchmark")
	void runQuickBenchmark() throws Exception {
		Options opt = new OptionsBuilder().include(".*Benchmark.*")
			.forks(0) // No forking for quick validation
			.warmupIterations(1)
			.warmupTime(TimeValue.milliseconds(500))
			.measurementIterations(2)
			.measurementTime(TimeValue.milliseconds(500))
			.build();

		new Runner(opt).run();
	}

	/**
	 * Runs the full benchmark suite with proper warmup and measurement iterations.
	 * Results are saved to target/jmh-results.json
	 */
	@Test
	@Disabled("Run manually with: mvn test -Dtest=JmhBenchmarkTest#runFullBenchmark")
	void runFullBenchmark() throws Exception {
		Options opt = new OptionsBuilder().include(".*Benchmark.*")
			.forks(1)
			.warmupIterations(3)
			.warmupTime(TimeValue.seconds(1))
			.measurementIterations(5)
			.measurementTime(TimeValue.seconds(1))
			.resultFormat(ResultFormatType.JSON)
			.result("target/jmh-results.json")
			.build();

		new Runner(opt).run();
	}

	/**
	 * Runs only OwnerRepository benchmarks.
	 */
	@Test
	@Disabled("Run manually with: mvn test -Dtest=JmhBenchmarkTest#runOwnerBenchmark")
	void runOwnerBenchmark() throws Exception {
		Options opt = new OptionsBuilder().include("OwnerRepositoryBenchmark")
			.forks(0)
			.warmupIterations(1)
			.measurementIterations(3)
			.build();

		new Runner(opt).run();
	}

	/**
	 * Runs only VetRepository benchmarks.
	 */
	@Test
	@Disabled("Run manually with: mvn test -Dtest=JmhBenchmarkTest#runVetBenchmark")
	void runVetBenchmark() throws Exception {
		Options opt = new OptionsBuilder().include("VetRepositoryBenchmark")
			.forks(0)
			.warmupIterations(1)
			.measurementIterations(3)
			.build();

		new Runner(opt).run();
	}

}
