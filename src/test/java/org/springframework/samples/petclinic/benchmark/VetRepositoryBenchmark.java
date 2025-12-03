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

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.samples.petclinic.PetClinicApplication;
import org.springframework.samples.petclinic.vet.VetRepository;

/**
 * JMH Benchmark for VetRepository operations. Tests the performance of veterinarian data
 * operations with caching.
 *
 * @author Dependability Analysis Team
 */
@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(value = 1, warmups = 0)
@Warmup(iterations = 2, time = 1)
@Measurement(iterations = 3, time = 1)
public class VetRepositoryBenchmark {

	private ConfigurableApplicationContext context;

	private VetRepository vetRepository;

	@Setup
	public void setup() {
		context = SpringApplication.run(PetClinicApplication.class, "--spring.profiles.active=h2",
				"--spring.docker.compose.enabled=false", "--server.port=0");
		vetRepository = context.getBean(VetRepository.class);
	}

	@TearDown
	public void tearDown() {
		if (context != null) {
			context.close();
		}
	}

	@Benchmark
	public void findAllVets(Blackhole blackhole) {
		blackhole.consume(vetRepository.findAll());
	}

	@Benchmark
	public void findAllVetsPaginated(Blackhole blackhole) {
		blackhole.consume(vetRepository.findAll(PageRequest.of(0, 5)));
	}

	@Benchmark
	public void findAllVetsCachedMultipleCalls(Blackhole blackhole) {
		// Test cache effectiveness by making multiple calls
		for (int i = 0; i < 10; i++) {
			blackhole.consume(vetRepository.findAll());
		}
	}

}
