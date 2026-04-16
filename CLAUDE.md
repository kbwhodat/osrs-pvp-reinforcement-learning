# Project Instructions

## Overview
OSRS PvP RL agent using PPO + self-play. Two components: Python ML system (`pvp-ml/`) and Java game simulation (`simulation-rsps/`).

## Tech Stack
- Python 3.10, PyTorch 2.1.2, Gymnasium 0.28.1, Ray 2.7.1
- Java 17 (Gradle Kotlin DSL) for simulation server
- Conda/Mamba for environment management

## Code Style
- Black formatter, isort, flake8 (max-line-length 160)
- mypy strict mode (`mypy pvp_ml test --config=setup.cfg`)
- snake_case files/functions, PascalCase classes
- Pre-commit hooks enforce all formatting

## Testing
- Run unit tests: `cd pvp-ml && pytest ./test/unit/`
- Run integration tests: `cd pvp-ml && pytest ./test/integ/`
- Test convention: `test/unit/` and `test/integ/` directories, pytest with asyncio_mode=auto
- Java tests: `cd simulation-rsps/ElvargServer && ./gradlew check`

## Build & Run
- Create env: `cd pvp-ml && conda env create -p ./env -f environment.yml`
- Activate: `conda activate ./env`
- Train: `train --preset PastSelfPlay --name <experiment>`
- Evaluate: `eval --model-path <path>`
- Serve API: `serve-api`
- Linting: `cd pvp-ml && pre-commit run --all-files`

## Project Structure
- `contracts/environments/` — JSON action/observation schemas shared between Python and Java
- `pvp-ml/pvp_ml/ppo/` — PPO algorithm, policy network, buffer, trainer
- `pvp-ml/pvp_ml/env/` — Gymnasium env, async vectorized env, simulation launcher
- `pvp-ml/pvp_ml/callback/` — Training callbacks (self-play, eval, checkpointing)
- `pvp-ml/pvp_ml/scripted/` — Scripted baselines for evaluation
- `pvp-ml/pvp_ml/util/` — Helpers (ELO, schedules, MLP builder, noise)
- `pvp-ml/config/nh/` — Training YAML presets (core.yml is base config)
- `simulation-rsps/ElvargServer/` — Java game server for PvP simulation

## Conventions
- Training configs use YAML with schedule support (linear, expression-based annealing)
- Environment contracts in JSON define the Python↔Java interface
- Console entry points: `train`, `eval`, `serve-api` (defined in setup.py)
- CI runs: pre-commit → mypy → gradle check → unit tests → integration tests
