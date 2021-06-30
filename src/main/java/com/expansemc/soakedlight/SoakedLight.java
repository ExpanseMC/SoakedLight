package com.expansemc.soakedlight;

import com.google.inject.Inject;
import org.apache.logging.log4j.Logger;
import org.spongepowered.api.Server;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.lifecycle.StartedEngineEvent;
import org.spongepowered.plugin.jvm.Plugin;

@Plugin("soaked-light")
public final class SoakedLight {

    private final Logger logger;

    @Inject
    public SoakedLight(final Logger logger) {
        this.logger = logger;
    }

    @Listener
    public void onStarted(final StartedEngineEvent<Server> event) {
        this.logger.info("Integrated FLARD into the lighting engine.");
    }
}