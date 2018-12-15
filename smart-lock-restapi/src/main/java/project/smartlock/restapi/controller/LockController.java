package project.smartlock.restapi.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.smartlock.data.dto.LockDto;
import project.smartlock.restapi.service.LockService;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/locks")
@Slf4j
public class LockController {

    @Autowired
    private LockService lockService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getLock(@PathVariable Long id) {
        ResponseEntity<LockDto> responseEntity;
        try {
            LockDto requestedLock = lockService.getLock(id);
            responseEntity = new ResponseEntity<>(requestedLock, HttpStatus.OK);
        } catch (NoSuchElementException ex) {
            log.info("Lock {} not found", id);
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }

    @PostMapping("/")
    public LockDto addLock(@RequestBody LockDto lock) {
        LockDto addedLock = lockService.addLock(lock);
        return addedLock;
    }

    @PutMapping("/{id}")
    public ResponseEntity<LockDto> updateLock(@PathVariable Long id, @RequestBody LockDto lock) {
        ResponseEntity<LockDto> responseEntity;
        try {
            LockDto updatedLock = lockService.updateLock(id, lock);
            responseEntity = new ResponseEntity<>(updatedLock, HttpStatus.OK);
        } catch (NoSuchElementException ex) {
            log.info("Lock {} not found", id);
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<LockDto> deleteLock(@PathVariable Long id) {
        ResponseEntity<LockDto> responseEntity;
        try {
            LockDto deletedLock = lockService.deleteLock(id);
            responseEntity = new ResponseEntity<>(deletedLock, HttpStatus.OK);
        } catch (NoSuchElementException ex) {
            log.info("Lock {} not found", id);
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }
}
