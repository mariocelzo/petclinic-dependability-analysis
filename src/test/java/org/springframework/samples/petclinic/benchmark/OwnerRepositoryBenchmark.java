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
import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.samples.petclinic.owner.OwnerRepository;

/**
 * JMH Benchmark for OwnerRepository operations. Tests the performance of database
 * operations on the Owner entity.
 *
 * @author Dependability Analysis Team
 */
@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(value = 1, warmups = 0)
@Warmup(iterations = 2, time = 1)
@Measurement(iterations = 3, time = 1)
public class OwnerRepositoryBenchmark {

	private ConfigurableApplicationContext context;

	private OwnerRepository ownerRepository;

	@Setup
	public void setup() {
		context = SpringApplication.run(PetClinicApplication.class, "--spring.profiles.active=h2",
				"--spring.docker.compose.enabled=false", "--server.port=0");
		ownerRepository = context.getBean(OwnerRepository.class);
	}

	@TearDown
	public void tearDown() {
		if (context != null) {
			context.close();
		}
	}

	@Benchmark
	public void findAllOwners(Blackhole blackhole) {
		blackhole.consume(ownerRepository.findAll());
	}

	@Benchmark
	public void findOwnerById(Blackhole blackhole) {
		blackhole.consume(ownerRepository.findById(1));
	}

	@Benchmark
	public void findOwnersByLastName(Blackhole blackhole) {
		blackhole.consume(ownerRepository.findByLastNameStartingWith("Davis", PageRequest.of(0, 10)));
	}

	@Benchmark
	public void saveOwner(Blackhole blackhole) {
		Owner owner = new Owner();
		owner.setFirstName("Benchmark");
		owner.setLastName("Test");
		owner.setAddress("123 Test Street");
		owner.setCity("Test City");
		owner.setTelephone("1234567890");
		blackhole.consume(ownerRepository.save(owner));
	}

	@Benchmark
	public void countOwners(Blackhole blackhole) {
		blackhole.consume(ownerRepository.count());
	}

}
