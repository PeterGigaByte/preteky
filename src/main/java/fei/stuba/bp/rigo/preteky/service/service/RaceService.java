package fei.stuba.bp.rigo.preteky.service.service;


import fei.stuba.bp.rigo.preteky.models.sql.Race;
import fei.stuba.bp.rigo.preteky.web.dto.RaceRegistrationDto;
import fei.stuba.bp.rigo.preteky.web.dto.SettingsDto;
import fei.stuba.bp.rigo.preteky.web.dto.TrackDto;

import java.util.List;
import java.util.Optional;

public interface RaceService {
    void save(RaceRegistrationDto raceRegistrationDto, SettingsDto settingsDto, TrackDto trackDto);
    void edit(Race race);
    List<Race> listRaces();
    Optional<Race> getRace(int id);
    List<Race> getActiveRace();
    void deleteRace(Race race);
    void changeActivity(Race race);
    Race getRaceById(Integer id);
    Race getFakeRace();
}
